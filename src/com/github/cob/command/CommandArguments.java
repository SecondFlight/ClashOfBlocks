package com.github.cob.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Richmond Steele
 * @since 11/27/13
 *        All rights Reserved
 *        Please read included LICENSE file
 */
public class CommandArguments
{
    private final CommandSender sender;
    private final Command       command;
    private final String name;
    private final String[] args;

    public CommandArguments(CommandSender sender, Command command, String s, String[] strings)
    {
        this.sender = sender;
        this.command = command;
        this.name = s;
        this.args = strings;
    }

    public CommandSender getSender()
    {
        return sender;
    }

    public Command getCommand()
    {
        return command;
    }

    public String getName()
    {
        return name;
    }

    public String[] getArgs()
    {
        return args;
    }

    public Player getPlayer()
    {
        return isPlayer() ? (Player) sender : null;
    }

    private boolean isPlayer()
    {
        return getSender() instanceof Player;
    }
}
