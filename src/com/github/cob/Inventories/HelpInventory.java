package com.github.cob.Inventories;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HelpInventory {
	
	public static Inventory HelpMenu = Bukkit.createInventory(null, 9, ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Help Menu");

	
	static {
		
		 ItemStack HelpItem1 = new ItemStack(Material.FIREBALL,1);
	        ItemMeta im1 = HelpItem1.getItemMeta();
	        im1.setDisplayName(ChatColor.DARK_RED+"Admin Help");
	        HelpItem1.setItemMeta(im1);
	        
	        ItemStack HelpItem2 = new ItemStack(Material.MAGMA_CREAM,1);
	        ItemMeta im2 = HelpItem2.getItemMeta();
	        im2.setDisplayName(ChatColor.DARK_GREEN+"Player Help");
	        HelpItem2.setItemMeta(im2);
	        
	        ItemStack HelpItem3 = new ItemStack(Material.LAVA_BUCKET,1);
	        ItemMeta im3 = HelpItem3.getItemMeta();
	        im3.setDisplayName(ChatColor.DARK_RED+"Exit");
	        im3.setLore(Arrays.asList(ChatColor.RED+"Click to Close GUI"));
	        HelpItem3.setItemMeta(im3);
		
	        HelpMenu.setItem(0, HelpItem1);
	        HelpMenu.setItem(1, HelpItem2);
	        HelpMenu.setItem(8, HelpItem3);
		
		
	}
}
