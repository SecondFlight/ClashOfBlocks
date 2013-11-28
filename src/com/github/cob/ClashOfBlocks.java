package com.github.cob;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


import com.github.cob.Commands.Testy;
import com.github.cob.Listeners.InvListeners.AdminHelpInvLis;
import com.github.cob.Listeners.InvListeners.MainHelpInvLis;
import com.github.cob.Listeners.InvListeners.PlayerHelpInvLis;
import com.github.cob.Listeners.InvListeners.PluginDetailsInvLis;


public class ClashOfBlocks extends JavaPlugin {
	private static ClashOfBlocks instance;
	
	public final MainHelpInvLis MHIL = new MainHelpInvLis();
	public final AdminHelpInvLis AHIL = new AdminHelpInvLis();
	public final PlayerHelpInvLis PHIL = new PlayerHelpInvLis();
	public final PluginDetailsInvLis PDIL = new PluginDetailsInvLis();
	
	public void onEnable(){
		
		this.setInstance(this);
		
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(MHIL, this);
		pm.registerEvents(AHIL, this);
		pm.registerEvents(PHIL, this);
		pm.registerEvents(PDIL, this);
		
		
		getCommand("help").setExecutor(new Testy());
		
	}
	
	public void onDisable(){
		
		
	}
	
	
	public static ClashOfBlocks getInstance()
	{
	    return instance;
	}
	
	
	private void setInstance(ClashOfBlocks inst)
	{
	    instance = inst;
	}	

}
