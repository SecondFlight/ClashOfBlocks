package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.inventories.MenuItem;

public class ItemPlayerCommands extends MenuItem {
	
	public ItemPlayerCommands() {
		super(Material.BOOK_AND_QUILL);
		this.setName(ChatColor.DARK_GREEN + "Player Commands");
		//Lore of Commands/or send message of commands
	}
	
	public void onClick(InventoryClickEvent event) {
		
	}

}
