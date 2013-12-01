package com.github.cob.currency;

import java.util.HashMap;

import com.github.cob.api.COBAPI;

public class Trophies {
	
	private HashMap<String, Integer> trophies = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getTrophies() {
		return this.trophies;
	}
	
	public int getTrophies(String player) {
		return (this.trophies.containsKey(player) ? this.trophies.get(player) : -1);
	}
	
	public void setTrophies(String player, int trophies) {
		this.trophies.put(player, trophies);
		COBAPI.updateStats(player);
	}

}
