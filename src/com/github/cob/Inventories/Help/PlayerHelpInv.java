package com.github.cob.inventories.help;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerHelpInv {
	
	public static Inventory PlayerHelp = Bukkit.createInventory(null, 9, ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Player Help");
	
	static{
		ItemStack PlayerItem1 = new ItemStack(Material.LAVA_BUCKET,1);
        ItemMeta im1 = PlayerItem1.getItemMeta();
        im1.setDisplayName(ChatColor.DARK_RED+"Exit");
        im1.setLore(Arrays.asList(ChatColor.RED+"Click to Close GUI"));
        PlayerItem1.setItemMeta(im1);
        
        ItemStack PlayerItem2 = new ItemStack(Material.BOOK, 1);
        ItemMeta im2 = PlayerItem2.getItemMeta();
        im2.setDisplayName(ChatColor.DARK_GREEN+"Plugin Details");
        PlayerItem2.setItemMeta(im2);
        
       
        PlayerHelp.setItem(2, PlayerItem2);
        PlayerHelp.setItem(8, PlayerItem1);
        
	}

}
