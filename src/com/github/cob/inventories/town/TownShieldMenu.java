package com.github.cob.inventories.town;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemShield05;
import com.github.cob.inventories.items.ItemShield1;
import com.github.cob.inventories.items.ItemShield2;
import com.github.cob.inventories.items.ItemShield3;

public class TownShieldMenu extends Inventory {
	
	public TownShieldMenu() {
		super("townshield", ChatColor.DARK_GREEN +"Player Town");
		/*
		 * Implement COBAPI.getTownName()
		 * or something similar 
		 * to title inventory, per player
		 */
	}
	
	public void addItems() {
		this.addMenuItem(new ItemShield05().setItemPosition(0));
		this.addMenuItem(new ItemShield1().setItemPosition(1));
		this.addMenuItem(new ItemShield2().setItemPosition(2));
		this.addMenuItem(new ItemShield3().setItemPosition(3));
		this.addMenuItem(new ItemExit().setItemPosition(8));
		
	}
	
																		
	

}
