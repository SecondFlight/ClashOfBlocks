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

public class ToolDiamondPic extends MenuItem{
	
	public ToolDiamondPic() {
		super(Material.DIAMOND_PICKAXE);
		this.setName(ChatColor.DARK_AQUA+"Level 5: Pickaxe");
		this.addLore(ChatColor.DARK_GREEN+"35% Better chance of getting Gems from rocks",
				ChatColor.DARK_GREEN+"Cost: "+ChatColor.GOLD+"300 Gems");
		this.getItem().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		/*Add ToolDiamondPickaxe
		 * take the given amount of gems from player
		 * add error message if player does not have enough gems
		 */
		
		ItemStack pic = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta axe_m = pic.getItemMeta();
		axe_m.setDisplayName(ChatColor.DARK_AQUA+"Level 5: Pickaxe");
		List<String> list = new ArrayList<String>();
		list.add(ChatColor.DARK_GREEN+"35% Better chance of getting Gems from rocks");
		axe_m.setLore(list);
		pic.setItemMeta(axe_m);
		pic.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
		
		event.getWhoClicked().closeInventory();
		ClashOfBlocks.getInstance().getGems().minusGems(event.getWhoClicked().getName(), 300);
		event.getWhoClicked().getInventory().addItem(pic);
	}

}
