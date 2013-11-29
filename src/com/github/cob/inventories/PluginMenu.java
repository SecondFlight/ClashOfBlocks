package com.github.cob.inventories;

import org.bukkit.ChatColor;
import com.github.cob.inventories.items.ItemAuthors;
import com.github.cob.inventories.items.ItemDevelopers;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemPluginDetails;

public class PluginMenu extends Inventory {
	
	public PluginMenu() {
		super("pluginmenu", ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Plugin Details");
	}
	
	public void addItems() {
		this.addMenuItem(new ItemAuthors().setItemPosition(0));
		this.addMenuItem(new ItemDevelopers().setItemPosition(2));
		this.addMenuItem(new ItemPluginDetails().setItemPosition(4));
		this.addMenuItem(new ItemExit().setItemPosition(8));
	}

}