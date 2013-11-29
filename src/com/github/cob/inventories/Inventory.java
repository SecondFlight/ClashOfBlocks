package com.github.cob.inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Inventory {
	
	private org.bukkit.inventory.Inventory inventory;
	private MenuItem[] items = new MenuItem[54];
	private String name;
	private String unlocalizedName;
	
	public Inventory(String unlocalizedName, String name, int rows) {
		if (rows > 6) rows = 6;
		this.setInventory(Bukkit.createInventory(null, 9 * rows, name));
		this.name = ChatColor.stripColor(name);
		this.unlocalizedName = unlocalizedName;
		this.setup();
	}
	
	public Inventory(String unlocalizedName, String name) {
		this(unlocalizedName, name, 1);
	}
	
	public void addItems() {}
	
	public void setup() {
		this.addItems();
		for (MenuItem item : this.getMenuItems()) {
			if (item == null) break;
			this.getInventory().setItem(item.getItemPosition(), item.getItem());
		}
	}
	
	public org.bukkit.inventory.Inventory getInventory() {
		return this.inventory;
	}
	
	public boolean isInventory(org.bukkit.inventory.Inventory inventory) {
		return (this.getInventory().getName().equals(inventory.getName()));
	}
	
	public void setInventory(org.bukkit.inventory.Inventory inventory) {
		this.inventory = inventory;
	}
	
	public MenuItem[] getMenuItems() {
		return this.items;
	}
	
	public void addMenuItem(MenuItem item) {
		int pos = 0;
		for (MenuItem ite : this.getMenuItems()) {
			if (ite != null) {
				pos++;
				continue;
			}
			this.getMenuItems()[pos] = item;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUnlocalizedName() {
		return this.unlocalizedName;
	}
	
}
