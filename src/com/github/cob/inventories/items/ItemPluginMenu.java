package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemPluginMenu extends MenuItem {
	
	public ItemPluginMenu() {
		super(Material.BOOK);
		this.setName(ChatColor.DARK_GREEN + "Plugin Details");
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.PLUGIN_MENU.getInventory().getInventory());
	}
	
}
