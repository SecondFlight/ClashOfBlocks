package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemShopArmy extends MenuItem {
	
	public ItemShopArmy(){
		super(Material.WOOD_SWORD);
		this.setName(ChatColor.LIGHT_PURPLE.toString()+ChatColor.BOLD.toString()+"Army");
	}

	public void onClick(InventoryClickEvent event) {
		//Open Army shop
		}
}
