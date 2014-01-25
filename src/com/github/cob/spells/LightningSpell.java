package com.github.cob.spells;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class LightningSpell implements Listener {
	
	private static String name = ChatColor.AQUA + ChatColor.BOLD.toString() + "Lightning Spell";
	private int level = 1;
	private int strike_damage = 0;
	private int strikes = 0;
	private int time_interval = 0;
	private int create_time = 0;
	private int spell_fac_required = 0;
	private int cost = 0;
	private int radius = 0;

	
	
	public LightningSpell setName(String name) {
		LightningSpell.name = name;
		return this;
	}
	
	public static String getName() {
		return LightningSpell.name;
	}
	
	
	public LightningSpell setLevel(int level) {
		this.level = level;
		return this;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public LightningSpell setStrikeDamage(int damage){
		this.strike_damage = damage;
		return this;
	}
	
	public int getStrikeDamage(){
		return this.strike_damage;
	}
	
	public LightningSpell setStrikeAmount(int amount){
		this.strikes = amount;
		return this;
	}
	
	public int getStrikeAmount(){
		return this.strikes;
	}
	
	public LightningSpell setTimeInterval(int interval){
		this.time_interval = interval;
		return this;
	}
	
	public int getTimeInterval(){
		return this.time_interval;
	}
	
	public LightningSpell setCreateTime(int time){
		this.create_time = time;
		return this;
	}
	
	public int getCreateTime(){
		return this.create_time;
	}
	
	public LightningSpell setSpellFacRequired(int spellfac_level){
		this.spell_fac_required = spellfac_level;
		return this;
	}
	
	public int getSpellFacRequired(){
		return this.spell_fac_required;
	}
	
	public LightningSpell setCost(int cost){
		this.cost = cost;
		return this;
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public LightningSpell setStrikeRadius(int radius){
		this.radius = radius;
		return this;
	}
	
	public int GetStrikeRadius(){
		return this.radius;
	}
	
	public static void  giveLightningSpell(HumanEntity clicker, int amount)
	{
		Potion splash = new Potion(PotionType.INSTANT_DAMAGE, amount);
		ItemStack potion = splash.toItemStack(1);
		ItemMeta meta = potion.getItemMeta();
		meta.setDisplayName(LightningSpell.getName());
		meta.setLore(Arrays.asList(
				ChatColor.BLUE+"",
				ChatColor.BLUE+"Electrocute your enemies with ",
				ChatColor.BLUE+"bolts of lightning!",
				ChatColor.BLUE+"Cast this spell at the enemy village to",
				ChatColor.BLUE+"damage buildings and units inside",
				ChatColor.BLUE+"a small area.",
				ChatColor.RESET+"",
				ChatColor.RED+"Left-Click for Use"));
		potion.setItemMeta(meta);
		
		clicker.getInventory().addItem(potion);
	}
	
	//Events
	
	@EventHandler
	public void StopConsumption(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		Action action = event.getAction();
	
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(LightningSpell.getName())){
			if(action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK))
			{									
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "Why are you drinking a spell!? Do you want to Spontaneously combust!?");
							
				
			}
		}
	}
	
	@EventHandler
	public void StopBlockBreaking (BlockBreakEvent event)
	{
		Player player = event.getPlayer();
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(LightningSpell.getName()))
		{
			event.setCancelled(true);
		}
		
	}
	
	@EventHandler
	public void LightningStriker(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		Action action = event.getAction();
		Location loc = player.getEyeLocation();
		
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(LightningSpell.getName())){
			if(action.equals(Action.LEFT_CLICK_AIR) || action.equals(Action.LEFT_CLICK_BLOCK)){
				player.getWorld().strikeLightning(loc);
				player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 200);
				
				/*
				 * Add in the radius, amount of strikes, 
				 * time taken to strike lightning the given amount of times
				 * damage to buildings
				 */
				
			}
			
		}
	}

}
