package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemShopBack extends MenuItem{
	
	public ItemShopBack(){
		super(Material.LAVA_BUCKET);
		this.setName(ChatColor.DARK_RED+"Back");
		this.addLore(ChatColor.RED+"Click to go back to the Shop");
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.SHOP_MENU.getInventory().getInventory());
	}

}
