package com.github.cob.Listeners.InvListeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.github.cob.Inventories.Help.AdminHelpInv;
import com.github.cob.Inventories.Help.PlayerHelpInv;

public class MainHelpInvLis implements Listener{
	
	@EventHandler
	public void ExitInventory(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Help Menu")) {
		if (clicked.getType() == Material.LAVA_BUCKET) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+"Exit")){
			event.setCancelled(true); 
			player.closeInventory(); 
				}
			}
		}
	}
	
	@EventHandler
	public void AdminHelp(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Help Menu")) {
		if (clicked.getType() == Material.FIREBALL) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+"Admin Help")){
				if(player.hasPermission("cob.adminhelp")){
			event.setCancelled(true); 
			player.openInventory(AdminHelpInv.AdminHelp);
					}
				}
			}
		}
	}
	
	@EventHandler
	public void PlayerHelp(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (inventory.getName().equals(ChatColor.GOLD+ ChatColor.BOLD.toString()+"COB: " +ChatColor.RESET + ChatColor.DARK_GREEN +"Help Menu")) {
		if (clicked.getType() == Material.MAGMA_CREAM) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN+"Player Help")){
				if(player.hasPermission("cob.playerhelp") || player.hasPermission("cob.adminhelp")){
			event.setCancelled(true); 
			player.openInventory(PlayerHelpInv.PlayerHelp);
					}
				}
			}
		}
	}

}