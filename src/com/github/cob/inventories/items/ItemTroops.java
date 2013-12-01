package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemTroops extends MenuItem {
	
	public ItemTroops() {
		super(Material.WOOD_SWORD);
		this.setName(ChatColor.DARK_RED.toString() + ChatColor.BOLD.toString() + "Troops");
		this.addLore(ChatColor.RED + "Click to Open your towns Troops options");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		//event.getWhoClicked().closeInventory();
		//event.getWhoClicked().openInventory(EnumInventories.TROOP_MENU.getInventory().getInventory());
		//Implement opening of Players Troop's menu
	} 

}
