package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemGold extends MenuItem {
	
	public ItemGold() {
		super(Material.GOLD_NUGGET);
		this.setName(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "Gold");
		this.addLore(ChatColor.GREEN + "Test");
					 
	}
	
	public void onClick(InventoryClickEvent event) {

	}  

}
