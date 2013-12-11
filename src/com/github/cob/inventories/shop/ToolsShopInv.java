package com.github.cob.inventories.shop;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.ItemShopBack;
import com.github.cob.inventories.items.shoptools.ToolDiamondAxe;
import com.github.cob.inventories.items.shoptools.ToolDiamondPic;
import com.github.cob.inventories.items.shoptools.ToolGoldAxe;
import com.github.cob.inventories.items.shoptools.ToolGoldPic;
import com.github.cob.inventories.items.shoptools.ToolIronAxe;
import com.github.cob.inventories.items.shoptools.ToolIronPic;
import com.github.cob.inventories.items.shoptools.ToolStoneAxe;
import com.github.cob.inventories.items.shoptools.ToolStonePic;
import com.github.cob.inventories.items.shoptools.ToolWoodAxe;
import com.github.cob.inventories.items.shoptools.ToolWoodPic;

public class ToolsShopInv extends Inventory {
	
	public ToolsShopInv() {
		super("toolsshopinv", ChatColor.GOLD.toString()+ChatColor.BOLD.toString() +"COB: "+ChatColor.RESET+ChatColor.DARK_GREEN+"Tool Shop", 3);
	}
	
	public void addItems() {
		this.addMenuItem(new ToolWoodPic().setItemPosition(0));
		this.addMenuItem(new ToolStonePic().setItemPosition(1));
		this.addMenuItem(new ToolIronPic().setItemPosition(2));
		this.addMenuItem(new ToolGoldPic().setItemPosition(3));
		this.addMenuItem(new ToolDiamondPic().setItemPosition(4));
		
		this.addMenuItem(new ItemShopBack().setItemPosition(16));
		this.addMenuItem(new ItemExit().setItemPosition(17));
		
		this.addMenuItem(new ToolWoodAxe().setItemPosition(18));
		this.addMenuItem(new ToolStoneAxe().setItemPosition(19));
		this.addMenuItem(new ToolIronAxe().setItemPosition(20));
		this.addMenuItem(new ToolGoldAxe().setItemPosition(21));
		this.addMenuItem(new ToolDiamondAxe().setItemPosition(22));
		
		
	}

}
