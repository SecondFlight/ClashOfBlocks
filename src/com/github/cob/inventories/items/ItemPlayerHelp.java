package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemPlayerHelp extends MenuItem {
	
	public ItemPlayerHelp() {
		super(Material.MAGMA_CREAM);
		this.setName(ChatColor.DARK_GREEN + "Player Help");
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.PLAYER_HELP.getInventory().getInventory());
	}
	
}
