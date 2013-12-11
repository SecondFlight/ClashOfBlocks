package com.github.cob.currency;

import java.util.HashMap;

import com.github.cob.api.COBAPI;

public class Gems {
	
	private HashMap<String, Integer> gems = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getGems() {
		return this.gems;
	}
	
	public int getGems(String player) {
		return (this.gems.containsKey(player) ? this.gems.get(player) : -1);
	}
	
	public void setGems(String player, int gold) {
		this.gems.put(player, gold);
		COBAPI.updateStats(player);
	}
	
	public void minusGems(String player, int amount)
    {
        if(gems.containsKey(player))
            gems.put(player, gems.get(player) - amount);
        COBAPI.updateStats(player);
    }
	
	public void addGems(String player, int amount)
    {
        if(gems.containsKey(player))
            gems.put(player, gems.get(player) + amount);
        COBAPI.updateStats(player);
    }


}
