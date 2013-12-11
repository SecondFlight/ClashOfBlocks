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

public class ToolIronPic extends MenuItem {
	
	public ToolIronPic() {
		super(Material.IRON_PICKAXE);
		this.setName(ChatColor.DARK_AQUA+"Level 3: Pickaxe");
		this.addLore(ChatColor.DARK_GREEN+"20% Better chance of getting Gems from rocks",
				ChatColor.DARK_GREEN+"Cost: "+ChatColor.GOLD+"150 Gems");
		this.getItem().addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
	}
	
	public void onClick(InventoryClickEvent event) {
		event.getWhoClicked().closeInventory();
		/*Add ToolIronPic
		 * take the given amount of gems from player
		 * add error message if player does not have enough gems
		 */
		
		ItemStack pic = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta axe_m = pic.getItemMeta();
		axe_m.setDisplayName(ChatColor.DARK_AQUA+"Level 3: Pickaxe");
		List<String> list = new ArrayList<String>();
		list.add(ChatColor.DARK_GREEN+"20% Better chance of getting Gems from rocks");
		axe_m.setLore(list);
		pic.setItemMeta(axe_m);
		pic.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
		
		event.getWhoClicked().closeInventory();
		ClashOfBlocks.getInstance().getGems().minusGems(event.getWhoClicked().getName(), 150);
		event.getWhoClicked().getInventory().addItem(pic);
	}


}
