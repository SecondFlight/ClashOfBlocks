package com.github.cob.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.github.cob.command.CommandArguments;
import com.github.cob.command.CommandHandler;
import com.github.cob.enums.EnumInventories;

public class CommandShop {
	
	 @CommandHandler(name = "shop")
	    public void shopCommand(CommandArguments args)
	    {
	        Player p = args.getPlayer();
	        if (p == null)
	        { return; }
	        if(!p.hasPermission("cob.shop")){
	        	p.sendMessage(ChatColor.DARK_RED+"You do not have permission to do that");
	        }
	        p.openInventory(EnumInventories.SHOP_MENU.getInventory().getInventory());
	    }


}
