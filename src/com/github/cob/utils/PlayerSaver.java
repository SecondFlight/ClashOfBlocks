package com.github.cob.utils;

import com.github.cob.ClashOfBlocks;
import com.github.cob.currency.DarkElixir;
import com.github.cob.currency.Elixir;
import com.github.cob.currency.Gems;
import com.github.cob.currency.Gold;
import com.github.cob.currency.Trophies;

public class PlayerSaver implements Runnable {
	
	private Gold gold = null;
	private Elixir elixir = null;
	private DarkElixir darkElixir = null;
	private Gems gems = null;
	private Trophies trophies = null;
	private long startTime;
	private boolean firstRun = true;
	
	public PlayerSaver(Gold gold, Elixir elixir, DarkElixir darkElixir, Gems gems, Trophies trophies) {
		this.gold = gold;
		this.elixir = elixir;
		this.darkElixir = darkElixir;
		this.gems = gems;
		this.trophies = trophies;
		this.startTime = System.currentTimeMillis();
	}
	
	@Override
	public void run() {
		long now = System.currentTimeMillis();
		if (!this.firstRun) {
			ClashOfBlocks.getInstance().getLogger().info("Saving players...");
		}
		ClashOfBlocks.getInstance().getPlayerData().savePlayers(this.gold, this.elixir, this.darkElixir, this.gems, this.trophies);
		if(!this.firstRun) {
			ClashOfBlocks.getInstance().getLogger().info("Players saved. (Took " + (System.currentTimeMillis() - now) + "ms)");
			ClashOfBlocks.getInstance().getLogger().info("Time since last save: " + (now - this.startTime) + "ms (" + ((now - this.startTime) / 1000) + "secs)");
			this.startTime = System.currentTimeMillis();
		}
		this.firstRun = false;
	}

}
