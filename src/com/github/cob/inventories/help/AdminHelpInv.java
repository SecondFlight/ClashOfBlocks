package com.github.cob.inventories.help;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemPluginMenu;

public class AdminHelpInv extends Inventory {
	
	public AdminHelpInv() {
		super("adminhelp", ChatColor.GOLD + "" + ChatColor.BOLD + "COB: " + ChatColor.DARK_GREEN + "Admin Help");
	}
	
	public void addItems() {
		this.addMenuItem(new ItemPluginMenu().setItemPosition(0));
		this.addMenuItem(new ItemExit().setItemPosition(8));
	}

}