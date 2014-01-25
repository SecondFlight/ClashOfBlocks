package com.github.cob.inventories.items.spells;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import com.github.cob.inventories.MenuItem;
import com.github.cob.spells.HealingSpell;

public class ItemHealingSpell extends MenuItem {

	public ItemHealingSpell() {
		super(new Potion(PotionType.SPEED), 1, ChatColor.DARK_BLUE
				+ "Healing Spell");

	}

	public void onClick(InventoryClickEvent event) {
		HumanEntity player = event.getWhoClicked();
		HealingSpell.giveHealingSpell(player, 1);
		event.setCancelled(true);
	}

}
