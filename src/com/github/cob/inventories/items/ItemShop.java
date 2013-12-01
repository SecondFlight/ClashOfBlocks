package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemShop extends MenuItem {
	
	public ItemShop() {
		super(Material.BOOK_AND_QUILL);
		this.setName(ChatColor.DARK_GREEN.toString() + ChatColor.BOLD.toString() + "Shop");
		this.addLore(ChatColor.GREEN + "Click to Open the shop");
					 
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.SHOP_MENU.getInventory().getInventory());
		
	}
 

}
