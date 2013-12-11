package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemHelpBack extends MenuItem {
	
	public ItemHelpBack() {
		super(Material.LAVA_BUCKET);
		this.setName(ChatColor.DARK_RED + "Back");
		this.addLore(ChatColor.RED + "Click to go back to the Help menu");
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.MAIN_HELP.getInventory().getInventory());
	}

}
