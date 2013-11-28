package com.github.cob.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.github.cob.ClashOfBlocks;
import com.github.cob.api.COBAPI;

public class FirstJoinListener implements Listener {
        
        
        @EventHandler
        public void FirstJoin(PlayerJoinEvent event){
                //Set Currencys 
                if (ClashOfBlocks.getInstance().getGold().getGold(event.getPlayer().getName()) == -1) {
                        ClashOfBlocks.getInstance().getGold().setGold(event.getPlayer().getName(), 0);
                        ClashOfBlocks.getInstance().getElixir().setElixir(event.getPlayer().getName(), 0);
                        ClashOfBlocks.getInstance().getDarkElixir().setDarkElixir(event.getPlayer().getName(), 0);
                        ClashOfBlocks.getInstance().getGems().setGems(event.getPlayer().getName(), 0);
                }
                else
                        COBAPI.updateStats(event.getPlayer().getName());
        }

}