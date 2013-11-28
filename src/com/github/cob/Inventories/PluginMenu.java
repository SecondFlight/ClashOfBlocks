package com.github.cob.inventories;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PluginMenu {
	
	public static Inventory PluginMenu = Bukkit.createInventory(null, 9, ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Plugin Details");
	
	static{
		
			ItemStack DetailItem1 = new ItemStack(Material.LAVA_BUCKET,1);
	        ItemMeta im1 = DetailItem1.getItemMeta();
	        im1.setDisplayName(ChatColor.DARK_RED+"Exit");
	        im1.setLore(Arrays.asList(ChatColor.RED+"Click to Close GUI"));
	        DetailItem1.setItemMeta(im1);
	        
	        ItemStack DetailItem2 = new ItemStack(Material.BOOK, 1);
	        ItemMeta im2 = DetailItem2.getItemMeta();
	        im2.setDisplayName(ChatColor.DARK_RED+ChatColor.BOLD.toString()+"Author");
	        im2.setLore(Arrays.asList(ChatColor.RED+"Author: Aperx"));
	        DetailItem2.setItemMeta(im2);
	        
	        ItemStack DetailItem3 = new ItemStack(Material.PAPER, 1);
	        ItemMeta im3 = DetailItem3.getItemMeta();
	        im3.setDisplayName(ChatColor.AQUA+ChatColor.BOLD.toString()+"Developers");
	        ArrayList<String> lore3 = new ArrayList<String>();
	        lore3.add(ChatColor.BLUE+"Developers: Stilldabomb");
	        lore3.add(ChatColor.BLUE+"Not2EXcel");
	        lore3.add(ChatColor.BLUE+"Mineu999");
	        im3.setLore(lore3);
	        DetailItem3.setItemMeta(im3);
	        
	        ItemStack DetailItem4 = new ItemStack(Material.BOOK_AND_QUILL, 1);
	        ItemMeta im4 = DetailItem4.getItemMeta();
	        im4.setDisplayName(ChatColor.DARK_GREEN+ChatColor.BOLD.toString()+"Plugin Details");
	        ArrayList<String> lore4 = new ArrayList<String>();
	        lore4.add(ChatColor.GREEN+"Version: 0.1");
	        lore4.add(ChatColor.GREEN+"Name: ClashOfBlocks");
	        im4.setLore(lore4);
	        DetailItem4.setItemMeta(im4);
	        
	        //Add item with website/wiki link
	        
	        PluginMenu.setItem(0, DetailItem2);
	        PluginMenu.setItem(1, DetailItem3);
	        PluginMenu.setItem(2, DetailItem4);
	        PluginMenu.setItem(8, DetailItem1);
	        
		
		
		
	}

}
