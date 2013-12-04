package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemShopResources extends MenuItem {
	
	public ItemShopResources(){
		super(Material.GOLD_NUGGET);
		this.setName(ChatColor.GOLD.toString()+ChatColor.BOLD.toString()+"Resources");
		
	}
	
	public void onClick(InventoryClickEvent event) {
	//Open Resources shop
	}

}
