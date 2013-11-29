package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemAdminHelp extends MenuItem {
	
	public ItemAdminHelp() {
		super(Material.FIREBALL);
		this.setName(ChatColor.DARK_RED + "Admin Help");
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.ADMIN_HELP.getInventory().getInventory());
	}
	
}
