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

public class PlayerHelpInvLis implements Listener {
	
	@EventHandler
	public void ExitInventory(InventoryClickEvent event) {
	Player player = (Player) event.getWhoClicked(); 
	ItemStack clicked = event.getCurrentItem(); 
	Inventory inventory = event.getInventory(); 
	
	if (EnumInventories.PLAYER_HELP.getInventory().isInventory(inventory)) {
		event.setCancelled(true);
		if (clicked == null) {
			event.getWhoClicked().closeInventory();
			return;
		}
		if (clicked.getType() == Material.LAVA_BUCKET) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_RED+"Exit")){
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
	
	if (EnumInventories.PLAYER_HELP.getInventory().isInventory(inventory)) {
		event.setCancelled(true);
		if (clicked == null) {
			event.getWhoClicked().closeInventory();
			return;
		}
		if (clicked.getType() == Material.BOOK) { 
			if(clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN+"Plugin Details")){
			player.openInventory(EnumInventories.PLAYER_HELP.getInventory().getInventory());
				}
			}
		}
	}
	
	

}