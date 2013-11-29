package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemExit extends MenuItem {
	
	public ItemExit() {
		super(Material.LAVA_BUCKET);
		this.setName(ChatColor.DARK_RED + "Exit");
		this.addLore(ChatColor.RED + "Click to Close Menu");
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
	}
	
}
