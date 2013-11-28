package com.github.cob.buildings;

import java.io.File;
import java.io.InputStream;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.github.cob.ClashOfBlocks;

public class Buildings {
	
	// Defense
	
	
	// Resources
	public static Building GOLD_STORAGE_1 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_2 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_3 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_4 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_5 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_6 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_7 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_8 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_9 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_10 = new Building("Gold Storage");
	public static Building GOLD_STORAGE_11 = new Building("Gold Storage");
	public static Building ELIXIR_STORAGE_1 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_2 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_3 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_4 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_5 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_6 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_7 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_8 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_9 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_10 = new Building("Elixir Storage");
	public static Building ELIXIR_STORAGE_11 = new Building("Elixir Storage");
	
	// Army
	
	
	// Decorations
	
	
	public void loadBuildings() {
		GOLD_STORAGE_1.setStorageCapacity(this.$getBuildings().getInt("resources.GOLD_STORAGE_1.storage_cap"));
	}
	
	private FileConfiguration $buildings = null;
	private File $buildingsFile = null;
	
	private void $reloadBuildings() {
		if (this.$buildingsFile == null)
			this.$buildingsFile = new File(ClashOfBlocks.getInstance().getDataFolder(), "buildings.yml");
		
		this.$buildings = YamlConfiguration.loadConfiguration(this.$buildingsFile);
		
		InputStream defBuildingsStream = ClashOfBlocks.getInstance().getResource("buildings.yml");
		if (defBuildingsStream != null) {
			YamlConfiguration defBuildings = YamlConfiguration.loadConfiguration(defBuildingsStream);
			this.$buildings.setDefaults(defBuildings);
		}
	}
	
	private FileConfiguration $getBuildings() {
		if (this.$buildings == null)
			this.$reloadBuildings();
		
		return this.$buildings;
	}
	
}
