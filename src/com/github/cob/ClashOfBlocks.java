package com.github.cob;

import com.github.cob.command.CommandManager;
import com.github.cob.config.PlayerData;
import com.github.cob.currency.DarkElixir;
import com.github.cob.currency.Elixir;
import com.github.cob.currency.Gems;
import com.github.cob.currency.Gold;
import com.github.cob.enums.EnumInventories;
import com.github.cob.listeners.FirstJoinListener;
import com.github.cob.listeners.MenuClickListener;
import com.github.cob.utils.InventoryManager;
import com.github.cob.utils.PlayerSaver;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

//import com.github.cob.listeners.inventory.AdminHelpInvLis;
//import com.github.cob.listeners.inventory.MainHelpInvLis;
//import com.github.cob.listeners.inventory.PlayerHelpInvLis;
//import com.github.cob.listeners.inventory.PluginDetailsInvLis;


public class ClashOfBlocks extends JavaPlugin
{
    private static ClashOfBlocks                            instance;
    private        CommandManager commandManager;
    private        InventoryManager                         inventoryManager;


    private PlayerData playerData          = new PlayerData();
    private Gold       gold                = new Gold();
    private DarkElixir darkElixir          = new DarkElixir();
    private Elixir     elixir              = new Elixir();
    private Gems       gems                = new Gems();
    private String[][] defaultConfigValues = new String[][]{
            {"general.filetype", "flatfile"},
            {"general.save-interval", "300"}, // Is loaded as seconds
            //{"{KEY}", "{VALUE}"}
    };

    public void onEnable()
    {

        this.setInstance(this);

        this.loadConfig();
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new MenuClickListener(), this);
        pm.registerEvents(new FirstJoinListener(), this);

        //register the commands from different objects
        this.inventoryManager = new InventoryManager();
        EnumInventories.loadInventories();
        this.commandManager = new CommandManager(this);
        this.commandManager.registerCommands();
        this.commandManager.registerHelp();

        this.playerData.loadPlayers(this.gold, this.elixir, this.darkElixir, this.gems);
        this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new PlayerSaver(this.gold, this.elixir,
                                                                                        this.darkElixir, this.gems), 0,
                                                                  (this.getConfig().getInt("general.save-interval") *
                                                                   20));
    }

    public void onDisable()
    {
        this.playerData.savePlayers(this.gold, this.elixir, this.darkElixir, this.gems);
	}

	public static ClashOfBlocks getInstance()
	{
	    return instance;
	}
	
	
	private void setInstance(ClashOfBlocks inst)
	{
	    instance = inst;
	}
	
	private void loadConfig() {
		if (!(new File(this.getDataFolder(), "plugin.yml")).exists()) {
			for (String[] defaultSet : this.defaultConfigValues) {
				if (isInteger(defaultSet[1]))
					this.getConfig().set(defaultSet[0], Integer.parseInt(defaultSet[1]));
				else
					this.getConfig().set(defaultSet[0], defaultSet[1]);
			}
			this.saveConfig();
		}
		if ((!this.getConfig().contains("general.save-interval")) || this.getConfig().getInt("general.save-interval") < 60)
			this.getConfig().set("general.save-interval", 300);
		this.saveConfig();
	}
	
	public PlayerData getPlayerData() {
		return this.playerData;
	}
	
	public boolean isInteger(String str) {
	    return str.matches("^-?[0-9]+(\\.[0-9]+)?$");
	}
	
	public Gold getGold() {
		return this.gold;
	}
	
	public Elixir getElixir() {
		return this.elixir;
	}
	
	public DarkElixir getDarkElixir() {
		return this.darkElixir;
	}
	
	public Gems getGems() {
		return this.gems;
	}

    public CommandManager getCommandManager()
    {
        if (commandManager == null)
        { return new CommandManager(this); }
        return commandManager;
    }
    
    public InventoryManager getInventoryManager() {
    	return this.inventoryManager;
    }
}
