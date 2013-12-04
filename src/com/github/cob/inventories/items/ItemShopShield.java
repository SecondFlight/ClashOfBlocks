package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemShopShield extends MenuItem {
	
	public ItemShopShield(){
		super(Material.IRON_CHESTPLATE);
		this.setName(ChatColor.GRAY.toString()+ChatColor.BOLD.toString()+"Shields");
	}

	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.SHIELD_MENU.getInventory().getInventory());
		}
}
