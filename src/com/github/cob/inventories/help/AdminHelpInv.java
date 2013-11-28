package com.github.cob.inventories.help;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdminHelpInv {
	
	public static Inventory AdminHelp = Bukkit.createInventory(null, 9, ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Admin Help");
	
	static{
		
		ItemStack AdminItem1 = new ItemStack(Material.LAVA_BUCKET,1);
        ItemMeta im1 = AdminItem1.getItemMeta();
        im1.setDisplayName(ChatColor.DARK_RED+"Exit");
        im1.setLore(Arrays.asList(ChatColor.RED+"Click to Close GUI"));
        AdminItem1.setItemMeta(im1);
        
        ItemStack AdminItem2 = new ItemStack(Material.BOOK, 1);
        ItemMeta im2 = AdminItem2.getItemMeta();
        im2.setDisplayName(ChatColor.DARK_GREEN+"Plugin Details");
        AdminItem2.setItemMeta(im2);
        
       
        AdminHelp.setItem(2, AdminItem2);
        AdminHelp.setItem(8, AdminItem1);
        
	}

}