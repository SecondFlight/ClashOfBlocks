package com.github.cob.inventories.town;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemBuildings;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemShield;
import com.github.cob.inventories.items.ItemShop;
import com.github.cob.inventories.items.ItemTroops;

public class MainTownInv extends Inventory {
	
	public MainTownInv() {
		super("maintown", ChatColor.DARK_GREEN +"Player Town");
		/*
		 * Implement COBAPI.getTownName()
		 * or something similar 
		 * to title inventory, per player
		 */
	}
	
	public void addItems() {
		
		this.addMenuItem(new ItemShop().setItemPosition(0));
		this.addMenuItem(new ItemBuildings().setItemPosition(1));
		this.addMenuItem(new ItemTroops().setItemPosition(2));
		this.addMenuItem(new ItemShield().setItemPosition(3));
		this.addMenuItem(new ItemExit().setItemPosition(8));
	}

}
