package com.github.cob.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * @author Richmond Steele
 * @since 11/27/13
 *        All rights Reserved
 *        Please read included LICENSE file
 */
public class AbstractCommand extends Command
{
    private Plugin plugin;

    public AbstractCommand(String command, Plugin plugin)
    {
        super(command);
        this.plugin = plugin;
    }

    public boolean execute(CommandSender sender, String commandLabel, String[] args)
    {
        return plugin.onCommand(sender, this, commandLabel, args);
    }
}
