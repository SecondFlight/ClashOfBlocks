package com.github.cob.commands;

import org.bukkit.entity.Player;

import com.not2excel.api.command.CommandHandler;
import com.not2excel.api.command.CommandListener;
import com.not2excel.api.command.objects.CommandInfo;

public class CommandGive implements CommandListener {
	
	  @CommandHandler(command = "cob.give" , permission = "cob.give")
	    public void giveCommand(CommandInfo args)
	    {
	        Player p = args.getPlayer();
	        if (p == null)
	        { return; }

	        if(args.getArgsLength() == 2){
	   
	        	
	        	
	        }
	    }



}
