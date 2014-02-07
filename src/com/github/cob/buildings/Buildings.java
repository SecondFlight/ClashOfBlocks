package com.github.cob.buildings;

import java.io.File;
import java.io.InputStream;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.github.cob.ClashOfBlocks;

public class Buildings implements Listener{
	
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
	@EventHandler
		public void onSignChange(SignChangeEvent e) {
		  if (e.getLine(0).egualsIgnoreCase("COB") || e.getLine(0).egualsIgnoreCase("[COB]")) {
		  e.setLine(0, "[COB]");
		  e.setLine(1, "[BUILD]");
		  }	
		}
		
		@EventHandler
		public void onSignChange(SignChangeEvent e) {
		  if (e.getLine(0).egualsIgnoreCase("COB") || e.getLine(0).egualsIgnoreCase("[COB]")
		  && e.getLine(1).egualsIgnoreCase("BUILD") 
		  || e.getLine(1).egualsIgnoreCase("[BUILD]"))
		  && e.getLine(2).equalsIgnoreCase("[TYPE]"){
		  e.setLine(0, "[COB]");
		  e.setLine(1, "[BUILD]");
		  e.setLine(2, "[MIC]");
		  }	
		}
		
		@EventHandler
		public void onPlayerInteract(PlayerInteractEvent e){
			if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(0).equalsIgnoreCase("[COB]") && s.getLine(1).equalsIgnoreCase("[BUILD]")
			&& e.getLine(2).equalsIgnoreCase("[MIC]"))  {
			 Player p = (Player) e.getPlayer();
				p.sendMessage("Do /cob types for the type of builds you can use")
		
		@EventHandler
		public void onPlayerInteract(PlayerInteractEvent e){
			if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(0).equalsIgnoreCase("[COB]") && s.getLine(1).equalsIgnoreCase("[BUILD]"))  {
			 Player p = (Player) e.getPlayer();
				p.sendMessage("Please specify what type of build do /cob builds for more info!");
		}
	}
	
}

	
}
