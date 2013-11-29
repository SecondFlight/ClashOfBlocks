package com.github.cob.commands;

import com.github.cob.command.CommandArguments;
import com.github.cob.command.CommandHandler;
import com.github.cob.enums.EnumInventories;

import org.bukkit.entity.Player;

public class Testy
{
    @CommandHandler(name = "help")
    public void helpCommand(CommandArguments args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
        p.openInventory(EnumInventories.MAIN_HELP.getInventory().getInventory());
    }
}