package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemBuildings extends MenuItem {
	
	public ItemBuildings() {
		super(Material.BRICK);
		this.setName(ChatColor.YELLOW.toString() + ChatColor.BOLD.toString() + "Authors");
		this.addLore(ChatColor.DARK_GREEN + "Click to Open your Buildings menu");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		//event.getWhoClicked().closeInventory();
		//event.getWhoClicked().openInventory(EnumInventories.TOWN_MENU.getInventory().getInventory());
		//Implement opening of Players Town's buildings menu
	}

}
