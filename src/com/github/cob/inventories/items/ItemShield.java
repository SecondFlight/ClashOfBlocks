package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemShield extends MenuItem {
	
	public ItemShield() {
		super(Material.IRON_CHESTPLATE);
		this.setName(ChatColor.DARK_GRAY.toString() + ChatColor.BOLD.toString() + "Shields");
		this.addLore(ChatColor.RED + "Click to Open the Shield shop");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.SHIELD_MENU.getInventory().getInventory());
		
	}  

}
