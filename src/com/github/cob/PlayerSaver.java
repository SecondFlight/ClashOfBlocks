package com.github.cob;

import com.github.cob.currency.DarkElixir;
import com.github.cob.currency.Elixir;
import com.github.cob.currency.Gems;
import com.github.cob.currency.Gold;

public class PlayerSaver implements Runnable {
	
	private Gold gold = null;
	private Elixir elixir = null;
	private DarkElixir darkElixir = null;
	private Gems gems = null;
	
	public PlayerSaver(Gold gold, Elixir elixir, DarkElixir darkElixir, Gems gems) {
		this.gold = gold;
		this.elixir = elixir;
		this.darkElixir = darkElixir;
		this.gems = gems;
	}
	
	@Override
	public void run() {
		ClashOfBlocks.getInstance().getPlayerData().savePlayers(this.gold, this.elixir, this.darkElixir, this.gems);
	}

}
