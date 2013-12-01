package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.github.cob.inventories.MenuItem;

public class ItemShield2 extends MenuItem {
	
	public ItemShield2() {
		super(Material.IRON_CHESTPLATE);
		this.setName(ChatColor.BLUE.toString() + ChatColor.BOLD.toString() + "Two Day Shield");
		this.addLore(ChatColor.RED + "Two Day Shield",
				ChatColor.RED+"Cost: "+ChatColor.DARK_GREEN+"150 Gems");
					 
	}


}
