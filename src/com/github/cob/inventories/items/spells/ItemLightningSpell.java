package com.github.cob.inventories.items.spells;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import com.github.cob.inventories.MenuItem;
import com.github.cob.spells.LightningSpell;

public class ItemLightningSpell extends MenuItem {

	public ItemLightningSpell() {
		super(new Potion(PotionType.SPEED), 1, ChatColor.DARK_BLUE
				+ "Lightning Spell");

	}

	public void onClick(InventoryClickEvent event) {
	HumanEntity clicker = event.getWhoClicked();
	
	LightningSpell.giveLightningSpell(clicker, 1);

		
		
		event.setCancelled(true);
	}

}
