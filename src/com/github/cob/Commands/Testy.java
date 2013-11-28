package com.github.cob.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.cob.Inventories.Help.MainHelpInv;

public class Testy implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
        Player p = (Player) sender;
		
        if(cmd.getName().equalsIgnoreCase("help")){
        	p.openInventory(MainHelpInv.HelpMenu);
        }
        
        return false;
        
	}
	
	

}
