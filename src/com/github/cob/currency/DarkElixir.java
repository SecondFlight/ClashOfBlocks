package com.github.cob.currency;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.github.cob.api.COBAPI;

public class DarkElixir {
	
	private HashMap<String, Integer> darkElixir = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getDarkElixir() {
		return this.darkElixir;
	}
	
	public int getDarkElixir(String player) {
		return (this.darkElixir.containsKey(player) ? this.darkElixir.get(player) : -1);
	}
	
	public void setDarkElixir(String player, int gold) {
		this.darkElixir.put(player, gold);
		COBAPI.updateStats(player);
	}
	
	 public void addDarkElixir(String player, int amount)
	    {
	        if(darkElixir.containsKey(player))
	            darkElixir.put(player, darkElixir.get(player) + amount);
	        COBAPI.updateStats(player);
	    }

}
