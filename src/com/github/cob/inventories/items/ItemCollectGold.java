package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemCollectGold extends MenuItem {
	
	public ItemCollectGold() {
		super(Material.GOLD_NUGGET);
		this.setName(ChatColor.GOLD.toString() + ChatColor.BOLD.toString() + "Collect");
		this.addLore(ChatColor.DARK_GREEN + "Click to Collect your Gold!");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		
	}  

}
