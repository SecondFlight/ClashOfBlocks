package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.github.cob.inventories.MenuItem;

public class ItemAuthors extends MenuItem {
	
	public ItemAuthors() {
		super(Material.BOOK);
		this.setName(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Authors");
		this.addLore(ChatColor.RED + "- Aperx",
					 ChatColor.RED + "- Stilldabomb");
	}
	
}
