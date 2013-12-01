package com.github.cob.commands;

import org.bukkit.entity.Player;

import com.github.cob.command.CommandArguments;
import com.github.cob.command.CommandHandler;
import com.github.cob.enums.EnumInventories;

public class Testy2 {
	
	 @CommandHandler(name = "shop")
	    public void shopCommand(CommandArguments args)
	    {
	        Player p = args.getPlayer();
	        if (p == null)
	        { return; }
	        p.openInventory(EnumInventories.MAIN_TOWN.getInventory().getInventory());
	    }
	

}
