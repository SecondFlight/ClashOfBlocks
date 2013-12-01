package com.github.cob.inventories.shop;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;

public class ShopInv extends Inventory{
	
	public ShopInv() {
		super("shopinv", ChatColor.GOLD.toString()+ChatColor.BOLD.toString() +"COB: "+ChatColor.RESET+ChatColor.DARK_GREEN+"Shop");
	}
	

	public void addItems() {
		
		this.addMenuItem(new ItemExit().setItemPosition(8));
		
	}
}
