package com.github.cob.command;

import com.github.cob.utils.ReflectionUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.help.GenericCommandHelpTopic;
import org.bukkit.help.HelpTopic;
import org.bukkit.help.HelpTopicComparator;
import org.bukkit.help.IndexHelpTopic;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.SimplePluginManager;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author Richmond Steele
 * @since 11/26/13
 *        All rights Reserved
 *        Please read included LICENSE file
 */
public class CommandManager
{
    private final Plugin plugin;
    private Map<String, RegisteredCommand> mappedCommands = new HashMap<String, RegisteredCommand>();
    private CommandMap commandMap;

    public CommandManager(Plugin plugin)
    {
        this.plugin = plugin;
    }

    public void registerCommands(Object object)
    {
        for (Method method : object.getClass().getMethods())
        {
            if (method.getAnnotation(CommandHandler.class) == null ||
                method.getParameterTypes().length != 1 ||
                method.getParameterTypes()[0] != CommandArguments.class)
            { continue; }
            CommandHandler commandHandler = method.getAnnotation(CommandHandler.class);
            registerCommand(commandHandler, method, object);
        }
    }

    public void registerCommand(CommandHandler commandHandler, Method method, Object object)
    {
        RegisteredCommand registeredCommand = new RegisteredCommand(method, object);
        mappedCommands.put(commandHandler.name(), registeredCommand);

        AbstractCommand command = new AbstractCommand(commandHandler.name().toLowerCase(), plugin);
        command.setAliases(Arrays.asList(commandHandler.aliases()));
        command.setPermission(commandHandler.permission());
        command.setPermissionMessage(commandHandler.noPermission());
        command.setDescription(commandHandler.description());
        command.setUsage(commandHandler.usage());
        if (getCommandMap().getCommand(command.getName()) == null)
        { getCommandMap().register(plugin.getName(), command); }
    }

    public boolean handleCommand(CommandSender sender, Command command, String s, String[] strings)
    {
        if (!plugin.isEnabled())
        { return false; }
        if (mappedCommands.containsKey(s))
        {
            RegisteredCommand registeredCommand = mappedCommands.get(s);
            CommandHandler commandHandler = registeredCommand.getMethod().getAnnotation(CommandHandler.class);
            if (!sender.hasPermission(commandHandler.permission()))
            { return false; }
            try
            {
                registeredCommand.getMethod().invoke(registeredCommand.getClazz(), new CommandArguments(sender, command,
                                                                                                        s, strings));
            }
            catch (IllegalAccessException e)
            { e.printStackTrace(); }
            catch (InvocationTargetException e)
            { e.printStackTrace(); }
        }
        return false;
    }

    public void registerHelp()
    {
        Set<HelpTopic> helpTopics = new TreeSet<HelpTopic>(HelpTopicComparator.helpTopicComparatorInstance());
        for (String s : mappedCommands.keySet())
        {
            Command command = commandMap.getCommand(s);
            HelpTopic topic = new GenericCommandHelpTopic(command);
            helpTopics.add(topic);
        }
        IndexHelpTopic topic = new IndexHelpTopic(plugin.getName(),
                                                  "All commands for " + plugin.getName(),
                                                  null,
                                                  helpTopics,
                                                  "Below is a list of all " + plugin.getName() + " commands:");
        Bukkit.getServer().getHelpMap().addTopic(topic);
    }

    private final CommandMap getCommandMap()
    {
        if (commandMap == null)
        {
            if (plugin.getServer().getPluginManager() instanceof SimplePluginManager)
            {
                try
                {
                    Object field = ReflectionUtils.getField(plugin.getServer().getPluginManager(), "commandMap");
                    commandMap = (SimpleCommandMap) field;
                }
                catch (NoSuchFieldException e)
                { e.printStackTrace(); }
                catch (IllegalAccessException e)
                { e.printStackTrace(); }
            }
        }
        return commandMap;
    }
}
