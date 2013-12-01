package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.ClashOfBlocks;
import com.github.cob.currency.Gems;
import com.github.cob.inventories.MenuItem;

public class ItemShield05 extends MenuItem{
	
	public ItemShield05() {
		super(Material.LEATHER_CHESTPLATE);
		this.setName(ChatColor.BLUE.toString() + ChatColor.BOLD.toString() + "12 Hour Shield");
		this.addLore(ChatColor.RED + "12 Hour Shield",
				ChatColor.RED+"Cost: "+ChatColor.DARK_GREEN+"75 Gems");
					 
	}

	public void onClick(InventoryClickEvent event) {
		//Set sheild to last for 12 hours
		//ClashOfBlocks.getInstance().getGems().getGems().minusGems(75);
		event.getWhoClicked().closeInventory();
	}
	
}
