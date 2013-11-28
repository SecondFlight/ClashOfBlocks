package com.github.cob.commands;

import com.github.cob.command.CommandArguments;
import com.github.cob.command.CommandHandler;
import com.github.cob.inventories.help.MainHelpInv;
import org.bukkit.entity.Player;

public class Testy
{
    @CommandHandler(name = "help")
    public void helpCommand(CommandArguments args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
        p.openInventory(MainHelpInv.HelpMenu);
    }
}