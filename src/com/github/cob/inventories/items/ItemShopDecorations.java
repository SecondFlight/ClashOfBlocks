package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemShopDecorations extends MenuItem {
	
	public ItemShopDecorations(){
		super(Material.RED_ROSE);
		this.setName(ChatColor.RED.toString()+ChatColor.BOLD.toString()+"Decorations");
		
	}
	
	public void onClick(InventoryClickEvent event) {
		//Open Decorations shop
		}

}
