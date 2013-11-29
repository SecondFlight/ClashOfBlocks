package com.github.cob.listeners.inventory;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import com.github.cob.enums.EnumInventories;

public class MainHelpInvLis implements Listener{
	
	@EventHandler
	public void ExitInventory(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (EnumInventories.MAIN_HELP.getInventory().isInventory(inventory)) {
		event.setCancelled(true);
		if (clicked == null) {
			event.getWhoClicked().closeInventory();
			return;
		}
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
	
	if (EnumInventories.MAIN_HELP.getInventory().isInventory(inventory)) {
		event.setCancelled(true);
		if (clicked == null) {
			event.getWhoClicked().closeInventory();
			return;
		}
		if (clicked.getType() == Material.FIREBALL) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+"Admin Help")){
				if(player.hasPermission("cob.adminhelp")){
			player.openInventory(EnumInventories.ADMIN_HELP.getInventory().getInventory());
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
	
	if (EnumInventories.MAIN_HELP.getInventory().isInventory(inventory)) {
		event.setCancelled(true);
		if (clicked == null) {
			event.getWhoClicked().closeInventory();
			return;
		}
		if (clicked.getType() == Material.MAGMA_CREAM) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN+"Player Help")){
				if(player.hasPermission("cob.playerhelp") || player.hasPermission("cob.adminhelp")){
			player.openInventory(EnumInventories.PLAYER_HELP.getInventory().getInventory());
					}
				}
			}
		}
	}

}