package com.github.cob.enums;

import com.github.cob.ClashOfBlocks;
import com.github.cob.inventories.Inventory;

public enum EnumInventories {
	MAIN_TOWN("maintown", com.github.cob.inventories.town.MainTownInv.class),
	PLUGIN_MENU("pluginmenu", com.github.cob.inventories.PluginMenu.class),
	ADMIN_HELP("adminhelp", com.github.cob.inventories.help.AdminHelpInv.class),
	MAIN_HELP("mainhelp", com.github.cob.inventories.help.MainHelpInv.class),
	PLAYER_HELP("playerhelp", com.github.cob.inventories.help.PlayerHelpInv.class);
	
	
	private String name;
	private Class<?> clazz;
	
	private EnumInventories(String name, Class<?> clazz) {
		this.name = name;
		this.clazz = clazz;
	}
	
	public String toString() {
		return this.name;
	}
	
	public Inventory getInventory() {
		try {
			return (Inventory)this.clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Inventory("unknown", "Unknown inventory");
	}
	
	public static void loadInventories() {
		for (EnumInventories inv : values())
			ClashOfBlocks.getInstance().getInventoryManager().addInventory((Inventory)inv.getInventory());
	}
	
}
