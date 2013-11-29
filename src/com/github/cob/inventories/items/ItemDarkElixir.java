package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemDarkElixir extends MenuItem {
	
	public ItemDarkElixir() {
		super(Material.MILK_BUCKET);
		this.setName(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD.toString() + "Dark Elixir");
		this.addLore(ChatColor.RED + "Test");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
	
	} 

}
