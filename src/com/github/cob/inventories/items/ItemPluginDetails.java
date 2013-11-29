package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.github.cob.ClashOfBlocks;
import com.github.cob.inventories.MenuItem;

public class ItemPluginDetails extends MenuItem {
	
	public ItemPluginDetails() {
		super(Material.BOOK_AND_QUILL);
		this.setName(ChatColor.DARK_GREEN.toString() + ChatColor.BOLD.toString() + "Plugin Details");
		this.addLore(ChatColor.GREEN + "Version: " + ChatColor.GOLD + ClashOfBlocks.getInstance().getDescription().getVersion(),
					 ChatColor.GREEN + "Name: " + ChatColor.GOLD + ClashOfBlocks.getInstance().getDescription().getName());
	}
	
}
