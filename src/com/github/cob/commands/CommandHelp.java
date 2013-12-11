package com.github.cob.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.github.cob.command.CommandArguments;
import com.github.cob.command.CommandHandler;
import com.github.cob.enums.EnumInventories;

public class CommandHelp {
	
	@CommandHandler(name = "help")
    public void helpCommand(CommandArguments args)
    {
        Player p = args.getPlayer();
        if (p == null)
        { return; }
        if(!p.hasPermission("cob.help")){
        p.sendMessage(ChatColor.DARK_RED+"You do not have permission to do that");
        }
        p.openInventory(EnumInventories.MAIN_HELP.getInventory().getInventory());
    }
}
