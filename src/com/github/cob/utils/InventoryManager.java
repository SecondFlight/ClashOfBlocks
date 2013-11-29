package com.github.cob.utils;

import com.github.cob.ClashOfBlocks;
import com.github.cob.inventories.Inventory;

public class InventoryManager {
	
	private Inventory[] inventories = new Inventory[1024];
	
	public Inventory[] getInventories() {
		return this.inventories;
	}
	
	public Inventory getInventory(String name) {
		for (Inventory inv : this.getInventories())
			if (inv != null) {
				if (inv.getName().equalsIgnoreCase(name) || inv.getUnlocalizedName().equalsIgnoreCase(name)) {
					inv.getInventory().clear();
					inv.setup();
					return inv;
				}
			}
		return new Inventory("unknown", "Unknown inventory");
	}
	
	public void addInventory(Inventory inventory) {
		int pos = 0;
		for (Inventory inv : this.getInventories()) {
			if (inv != null) {
				if (pos >= (this.getInventories().length - 1))
					ClashOfBlocks.getInstance().getLogger().severe("Too many inventories! (How can you exceed 1024 inventories?)");
				pos++;
				continue;
			}
			this.getInventories()[pos] = inventory;
			break;
		}
	}
	
}
