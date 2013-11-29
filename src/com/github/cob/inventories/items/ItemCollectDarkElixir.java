package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemCollectDarkElixir extends MenuItem {
	
	public ItemCollectDarkElixir() {
		super(Material.MILK_BUCKET);
		this.setName(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD.toString() + "Collect Dark Elixir");
		this.addLore(ChatColor.RED + "Click to Collect your Dark Elixir!");
					 
	}
	
	public void onClick(InventoryClickEvent event) {

	}  

}
