package com.github.cob.api;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import com.github.cob.ClashOfBlocks;
import com.github.cob.currency.DarkElixir;
import com.github.cob.currency.Elixir;
import com.github.cob.currency.Gems;
import com.github.cob.currency.Gold;

public class COBAPI {
	
	private static String[] info = new String[] {
			ChatColor.GOLD + "Gold",
			"{$GOLD}§6",
			"§a",
			ChatColor.DARK_PURPLE + "Elixir",
			"{$ELIXIR}§5",
			"§b",
			ChatColor.BLACK + "Dark Elixir",
			"{$DARKELIXIR}§0",
			"§c",
			ChatColor.GREEN + "" + ChatColor.BOLD + "Gems",
			"{$GEMS}§2"
	};
	
	public static void updateStats(String name) {
		if (ClashOfBlocks.getInstance().getServer().getPlayer(name) == null) return;
		Player player = ClashOfBlocks.getInstance().getServer().getPlayer(name);
		Scoreboard sb = ClashOfBlocks.getInstance().getServer().getScoreboardManager().getNewScoreboard();
		Server server = ClashOfBlocks.getInstance().getServer();
		Objective objective = sb.registerNewObjective("ClashOfBlocks", "dummy");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName(ChatColor.GOLD+ChatColor.BOLD.toString()+"  Clash of Blocks  ");
		String[] temp = new String[info.length];
		int pos = 0;
		
		for (String inf : info) {
			temp[(temp.length - 1) - pos] = inf;
			pos++;
		}
		pos = 0;
		for (String inf : temp) {
			(objective.getScore(server.getOfflinePlayer(parseString(player.getName(), inf)))).setScore(pos);
			pos++;
		}
		
		player.setScoreboard(sb);
	}
	
	public static String parseString(String player, String toBe) {
		Gold go = ClashOfBlocks.getInstance().getGold();
		Elixir el = ClashOfBlocks.getInstance().getElixir();
		DarkElixir de = ClashOfBlocks.getInstance().getDarkElixir();
		Gems ge = ClashOfBlocks.getInstance().getGems();
		
		toBe = toBe.replace("{$GOLD}", Integer.toString(go.getGold(player)));
		toBe = toBe.replace("{$ELIXIR}", Integer.toString(el.getElixir(player)));
		toBe = toBe.replace("{$DARKELIXIR}", Integer.toString(de.getDarkElixir(player)));
		toBe = toBe.replace("{$GEMS}", Integer.toString(ge.getGems(player)));
		return toBe;
	}
	
}
