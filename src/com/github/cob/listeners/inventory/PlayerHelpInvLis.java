package com.github.cob.listeners.inventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.github.cob.inventories.PluginMenu;

public class PlayerHelpInvLis implements Listener {
	
	@EventHandler
	public void ExitInventory(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Player Help")) {
		if (clicked.getType() == Material.LAVA_BUCKET) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+"Exit")){
			event.setCancelled(true); 
			player.closeInventory(); 
				}
			}
		}
	}
	
	@EventHandler
	public void OpenDetailsMenu(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Player Help")) {
		if (clicked.getType() == Material.BOOK) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN+"Plugin Details")){
			event.setCancelled(true); 
			player.openInventory(PluginMenu.PluginMenu);
				}
			}
		}
	}
	
	

}