package com.github.cob.inventories.shop;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemShopArmy;
import com.github.cob.inventories.items.ItemShopDecorations;
import com.github.cob.inventories.items.ItemShopDefenses;
import com.github.cob.inventories.items.ItemShopResources;
import com.github.cob.inventories.items.ItemShopShield;

public class ShopInv extends Inventory{
	
	public ShopInv() {
		super("shopinv", ChatColor.GOLD.toString()+ChatColor.BOLD.toString() +"COB: "+ChatColor.RESET+ChatColor.DARK_GREEN+"Shop");
	}
	

	public void addItems() {
		
		this.addMenuItem(new ItemShopResources().setItemPosition(0));
		this.addMenuItem(new ItemShopDecorations().setItemPosition(1));
		this.addMenuItem(new ItemShopArmy().setItemPosition(2));
		this.addMenuItem(new ItemShopDefenses().setItemPosition(3));
		this.addMenuItem(new ItemShopShield().setItemPosition(4));
		this.addMenuItem(new ItemExit().setItemPosition(8));
		
	}
}
