package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemCollectElixir extends MenuItem {
	
	public ItemCollectElixir() {
		super(Material.BUCKET);
		this.setName(ChatColor.LIGHT_PURPLE.toString() + ChatColor.BOLD.toString() + "Collect Elixir");
		this.addLore(ChatColor.RED + "Click to collect your Elixir!");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		
	}  

}
