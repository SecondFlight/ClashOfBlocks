package com.github.cob.listeners.inventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PluginDetailsInvLis implements Listener{
	
	@EventHandler
	public void ExitInventory(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Plugin Details")) {
		if (clicked.getType() == Material.LAVA_BUCKET) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+"Exit")){
			event.setCancelled(true); 
			player.closeInventory(); 
				}
			}
		}
	}
	
	@EventHandler
	public void StopMovement1(InventoryClickEvent event) { 
		ItemStack clicked = event.getCurrentItem(); 
		Inventory inventory = event.getInventory(); 
		
		if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Plugin Details")) {
			if (clicked.getType() == Material.BOOK) { 
				if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+ChatColor.BOLD.toString()+"Author")){
				event.setCancelled(true); 
				}
			}
		}	
	}
	
	@EventHandler
	public void StopMovement2(InventoryClickEvent event) { 
		ItemStack clicked = event.getCurrentItem(); 
		Inventory inventory = event.getInventory(); 
		
		if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Plugin Details")) {
			if (clicked.getType() == Material.PAPER) { 
				if(clicked.getItemMeta().getDisplayName().equals(ChatColor.AQUA+ChatColor.BOLD.toString()+"Developers")){
				event.setCancelled(true); 
				}
			}
		}	
	}
	
	@EventHandler
	public void StopMovement3(InventoryClickEvent event) { 
		ItemStack clicked = event.getCurrentItem(); 
		Inventory inventory = event.getInventory(); 
		
		if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Plugin Details")) {
			if (clicked.getType() == Material.BOOK_AND_QUILL) { 
				if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN+ChatColor.BOLD.toString()+"Plugin Details")){
				event.setCancelled(true); 
				}
			}
		}	
	}

}
