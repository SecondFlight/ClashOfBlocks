package com.github.cob.resolvers;

import com.github.cob.ClashOfBlocks;
import org.bukkit.entity.Player;

/**
 * Programmed by: DevRo_ (Erik Rosemberg)
 * Creation Date: 19, 01, 2014
 * Programmed for the ClashOfBlocks project.
 */
public class PlayerResolver {
    //*************************//
    //Can Afford Methods, return if the player has enough of the specified currency to afford something.

    public boolean canAffordWithGold(Player player, int gold)  {
        return ClashOfBlocks.getInstance().getGold().getGold(player.getName()) > gold;
    }

    public boolean canAffordWithGems(Player player, int gems)  {
        return ClashOfBlocks.getInstance().getGems().getGems(player.getName()) > gems;
    }

    public boolean canAffordWithElixir(Player player, int elixir)  {
        return ClashOfBlocks.getInstance().getElixir().getElixir(player.getName()) > elixir;
    }

    public boolean canAffordWithDarkElixir(Player player, int darkElixir)  {
        return ClashOfBlocks.getInstance().getDarkElixir().getDarkElixir(player.getName()) > darkElixir;
    }

    //*************************//
}
