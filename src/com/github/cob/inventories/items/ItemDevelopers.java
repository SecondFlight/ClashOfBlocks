package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.github.cob.inventories.MenuItem;

public class ItemDevelopers extends MenuItem {
	
	public ItemDevelopers() {
		super(Material.PAPER);
		this.setName(ChatColor.AQUA.toString() + ChatColor.BOLD.toString() + "Developers");
		this.addLore(ChatColor.RED  + "- Aperx",
					 ChatColor.RED  + "- Stilldabomb",
					 ChatColor.BLUE + "- Not2EXcel",
					 ChatColor.BLUE + "- Mineu999");
	}
	
}
