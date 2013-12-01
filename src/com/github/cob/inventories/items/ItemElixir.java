package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemElixir extends MenuItem {
	
	public ItemElixir() {
		super(Material.BUCKET);
		this.setName(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD.toString() + "Elixir");
		this.addLore(ChatColor.RED + "TEST");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
	
	}  

}
