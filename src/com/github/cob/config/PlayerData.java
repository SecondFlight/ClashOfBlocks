package com.github.cob.config;

import java.io.File;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.github.cob.ClashOfBlocks;
import com.github.cob.currency.*;

public class PlayerData {
	
	private FileConfiguration $players = null;
	private File $playersFile = null;
	
	private void $reloadPlayers() {
		if (this.$playersFile == null)
			this.$playersFile = new File(ClashOfBlocks.getInstance().getDataFolder(), "players.yml");
		
		this.$players = YamlConfiguration.loadConfiguration(this.$playersFile);
	}
	
	private FileConfiguration $getPlayers() {
		if (this.$players == null)
			this.$reloadPlayers();
		
		return this.$players;
	}
	
	private void $savePlayers() {
		if (this.$players == null || this.$playersFile == null) {
			return;
		}
		try {
			this.$getPlayers().save(this.$playersFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loadPlayers(Gold gold, Elixir elixir, DarkElixir darkElixir, Gems gems) {
		if (!(new File(ClashOfBlocks.getInstance().getDataFolder(), "players.yml")).exists()) {
			this.$getPlayers().set("player.stilldabomb.gold", 1290);
			this.$getPlayers().set("player.stilldabomb.elixir", 1290);
			this.$getPlayers().set("player.stilldabomb.darkelixir", 1290);
			this.$getPlayers().set("player.stilldabomb.gems", 1290);
			this.$savePlayers();
		}
		ConfigurationSection sec = this.$getPlayers().getConfigurationSection("player");
		for (String player : sec.getKeys(false)) {
			if (player == null) System.out.println("Player was null");
			gold.setGold(player, sec.getInt(player + ".gold"));
			elixir.setElixir(player, sec.getInt(player + ".elixir"));
			darkElixir.setDarkElixir(player, sec.getInt(player + ".darkelixir"));
			gems.setGems(player, sec.getInt(player + ".gems"));
		}
	}
	
	public void savePlayers(Gold gold, Elixir elixir, DarkElixir darkElixir, Gems gems) {
		for (String player : gold.getGold().keySet()) {
			this.$getPlayers().set("player." + player + ".gold", gold.getGold(player));
		}
		
		for (String player : elixir.getElixir().keySet()) {
			this.$getPlayers().set("player." + player + ".elixir", elixir.getElixir(player));
		}
		
		for (String player : darkElixir.getDarkElixir().keySet()) {
			this.$getPlayers().set("player." + player + ".darkelixir", darkElixir.getDarkElixir(player));
		}
		
		for (String player : gems.getGems().keySet()) {
			this.$getPlayers().set("player." + player + ".gems", gems.getGems(player));
		}
	}
	
}
