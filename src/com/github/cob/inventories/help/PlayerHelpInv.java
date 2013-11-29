package com.github.cob.inventories.help;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemPluginDetails;

public class PlayerHelpInv extends Inventory {
	
	public PlayerHelpInv() {
		super("playerhelp", ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Player Help");
	}
	
	public void addItems() {
		this.addMenuItem(new ItemPluginDetails().setItemPosition(0));
		this.addMenuItem(new ItemExit().setItemPosition(8));
	}

}