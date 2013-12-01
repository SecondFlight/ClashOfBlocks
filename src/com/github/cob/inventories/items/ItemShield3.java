package com.github.cob.inventories.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import com.github.cob.inventories.MenuItem;

public class ItemShield3 extends MenuItem{
	
	public ItemShield3() {
		super(Material.GOLD_CHESTPLATE);
		this.setName(ChatColor.BLUE.toString() + ChatColor.BOLD.toString() + "Seven Day Shield");
		this.addLore(ChatColor.RED + "Seven Day Shield",
				ChatColor.RED+"Cost: "+ChatColor.DARK_GREEN+"250 Gems");
					 
	}


}
