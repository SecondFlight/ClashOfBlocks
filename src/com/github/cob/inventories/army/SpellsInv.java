package com.github.cob.inventories.army;

import org.bukkit.ChatColor;

import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.items.ItemExit;
import com.github.cob.inventories.items.spells.ItemLightningSpell;

public class SpellsInv extends Inventory {
	
	public SpellsInv() {
		super("spellfactoryinv", ChatColor.GOLD + "" + ChatColor.BOLD + "COB: " + ChatColor.DARK_GREEN + "Spell Factory", 3);
	}
	
	public void addItems() {

		this.addMenuItem(new ItemExit().setItemPosition(8));
	}

}