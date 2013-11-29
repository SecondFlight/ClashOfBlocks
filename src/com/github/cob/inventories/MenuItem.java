package com.github.cob.inventories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuItem {
	
	private ItemStack item;
	private int itemPosition = 0;
	
	public MenuItem(Material item, int amount, String name) {
		this.item = new ItemStack(item, amount);
		this.setName(name);
	}
	
	public MenuItem(Material item, String name) {
		this(item, 1, name);
	}
	
	public MenuItem(Material item) {
		this(item, "");
	}
	
	public ItemStack getItem() {
		return this.item;
	}
	
	public MenuItem setName(String name) {
		ItemMeta itemMeta = this.getItem().getItemMeta();
		itemMeta.setDisplayName(name);
		this.getItem().setItemMeta(itemMeta);
		return this;
	}
	
	public MenuItem addLore(String... lore) {
		ItemMeta itemMeta = this.getItem().getItemMeta();
		if (itemMeta.hasLore()) {
			List<String> list = new ArrayList<String>();
			for (String lor : itemMeta.getLore())
				list.add(lor);
			for (String lor : lore)
				list.add(lor);
			itemMeta.setLore(list);
		}
		else {
			itemMeta.setLore(Arrays.asList(lore));
		}
		this.getItem().setItemMeta(itemMeta);
		return this;
	}
	
	public MenuItem setItemPosition(int itemPosition) {
		this.itemPosition = itemPosition;
		return this;
	}
	
	public int getItemPosition() {
		return this.itemPosition;
	}
	
	public void onClick(InventoryClickEvent event) {}
	
}
