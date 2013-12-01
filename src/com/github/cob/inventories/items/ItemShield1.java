package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.github.cob.inventories.MenuItem;

public class ItemShield1 extends MenuItem{
	
	public ItemShield1() {
		super(Material.CHAINMAIL_CHESTPLATE);
		this.setName(ChatColor.BLUE.toString() + ChatColor.BOLD.toString() + "One Day Shield");
		this.addLore(ChatColor.RED + "One Day Shield",
				ChatColor.RED+"Cost: "+ChatColor.DARK_GREEN+"100 Gems");
					 
	}

}
