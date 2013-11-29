package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemGem extends MenuItem {
	
	public ItemGem() {
		super(Material.EMERALD);
		this.setName(ChatColor.DARK_GREEN.toString() + ChatColor.BOLD.toString() + "Gems");
		this.addLore(ChatColor.GREEN + "Test");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
	
	}  

}
