package com.github.cob;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


import com.github.cob.Commands.Testy;
import com.github.cob.Listeners.HelpInvListeners;


public class ClashOfBlocks extends JavaPlugin {
	private static ClashOfBlocks instance;
	
	public final HelpInvListeners HIL = new HelpInvListeners();
	
	public void onEnable(){
		
		this.setInstance(this);
		
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(HIL, this);
		
		
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
