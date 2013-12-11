package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.enums.EnumInventories;
import com.github.cob.inventories.MenuItem;

public class ItemShopTools extends MenuItem {

	public ItemShopTools() {
		super(Material.WOOD_AXE);
		this.setName(ChatColor.DARK_AQUA.toString()+ChatColor.BOLD.toString()+"Tools");
	}

	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		event.getWhoClicked().openInventory(EnumInventories.TOOLS_SHOP.getInventory().getInventory());
		}
}
