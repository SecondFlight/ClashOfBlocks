package com.github.cob.inventories.help;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemAdminHelp;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemPlayerHelp;

public class MainHelpInv extends Inventory {
	
	public MainHelpInv() {
		super("mainhelp", ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Help Menu");
	}
	
	public void addItems() {
		this.addMenuItem(new ItemAdminHelp().setItemPosition(0));
		this.addMenuItem(new ItemPlayerHelp().setItemPosition(4));
		this.addMenuItem(new ItemExit().setItemPosition(8));
	}
}