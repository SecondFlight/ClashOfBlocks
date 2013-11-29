package com.github.cob.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.github.cob.ClashOfBlocks;
import com.github.cob.inventories.Inventory;
import com.github.cob.inventories.MenuItem;

public class MenuClickListener implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if (event.getSlot() == 999)
			event.getWhoClicked().closeInventory();
		for (Inventory inv : ClashOfBlocks.getInstance().getInventoryManager().getInventories()) {
			if (inv == null) break;
			if (inv.isInventory(event.getInventory())) {
				event.setCancelled(true);
				for (MenuItem item : inv.getMenuItems()) {
					if (item == null) break;
					if (event.getSlot() == item.getItemPosition()) {
						item.onClick(event);
						break;
					}
				}
				break;
			}
		}
	}
	
}
