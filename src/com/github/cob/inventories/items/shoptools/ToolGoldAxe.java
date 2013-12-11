package com.github.cob.inventories.items.shoptools;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.github.cob.ClashOfBlocks;
import com.github.cob.inventories.MenuItem;

public class ToolGoldAxe extends MenuItem{
	
	public ToolGoldAxe() {
		super(Material.GOLD_AXE);
		this.setName(ChatColor.DARK_AQUA+"Level 4: Axe");
		this.addLore(ChatColor.DARK_GREEN+"25% Better chance of getting Gems from trees",
				ChatColor.DARK_GREEN+"Cost: "+ChatColor.GOLD+"200 Gems");
		this.getItem().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 4);
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		/*Add ToolGoldAxe
		 * take the given amount of gems from player
		 * add error message if player does not have enough gems
		 */
		
		ItemStack axe = new ItemStack(Material.GOLD_AXE);
		ItemMeta axe_m = axe.getItemMeta();
		axe_m.setDisplayName(ChatColor.DARK_AQUA+"Level 4: Axe");
		List<String> list = new ArrayList<String>();
		list.add(ChatColor.DARK_GREEN+"25% Better chance of getting Gems from trees");
		axe_m.setLore(list);
		axe.setItemMeta(axe_m);
		axe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 4);
		
		event.getWhoClicked().closeInventory();
		ClashOfBlocks.getInstance().getGems().minusGems(event.getWhoClicked().getName(), 200);
		event.getWhoClicked().getInventory().addItem(axe);
	}

}
