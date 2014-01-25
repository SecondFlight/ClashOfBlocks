package com.github.cob.inventories.items.spells;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import com.github.cob.inventories.MenuItem;
import com.github.cob.spells.RageSpell;

public class ItemRageSpell extends MenuItem {

	public ItemRageSpell() {
		super(new Potion(PotionType.STRENGTH), 1, ChatColor.DARK_BLUE
				+ "Rage Spell");

	}

	public void onClick(InventoryClickEvent event) {
		HumanEntity player = event.getWhoClicked();
		RageSpell.giveRageSpell(player, 1);
		event.setCancelled(true);
	}

}