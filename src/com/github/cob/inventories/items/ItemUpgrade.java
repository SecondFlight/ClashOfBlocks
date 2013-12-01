package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemUpgrade extends MenuItem {
	
	public ItemUpgrade() {
		super(Material.IRON_AXE);
		this.setName(ChatColor.DARK_BLUE.toString() + ChatColor.BOLD.toString() + "Upgrade");
		this.addLore(ChatColor.RED + "Click to upgrade your Building!");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		//event.getWhoClicked().closeInventory();
		//event.getWhoClicked().openInventory(EnumInventories.TROOP_MENU.getInventory().getInventory());
		//Implement opening of Players Troop's menu
	} 

}
