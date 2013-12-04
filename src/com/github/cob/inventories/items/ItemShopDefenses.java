package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemShopDefenses extends MenuItem {
	
	public ItemShopDefenses(){
		super(Material.COBBLE_WALL);
		this.setName(ChatColor.GREEN.toString()+ChatColor.BOLD.toString()+"Defenses");
	}
	
	public void onClick(InventoryClickEvent event) {
		//Open Defenses shop
		}

}
