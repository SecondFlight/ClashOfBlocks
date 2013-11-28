package com.github.cob.currency;

import java.util.HashMap;

import com.github.cob.api.COBAPI;

public class Gems {
	
	private HashMap<String, Integer> gold = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getGems() {
		return this.gold;
	}
	
	public int getGems(String player) {
		return (this.gold.containsKey(player) ? this.gold.get(player) : -1);
	}
	
	public void setGems(String player, int gold) {
		this.gold.put(player, gold);
		COBAPI.updateStats(player);
	}

}
