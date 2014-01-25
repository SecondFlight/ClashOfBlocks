package com.github.cob.spells;

import java.util.Arrays;

import org.bukkit.ChatColor;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;


public class RageSpell implements Listener {
	
	
	private static String name = ChatColor.BLACK + ChatColor.BOLD.toString() + "Rage Spell";
	private int level = 1;
	private double duration = 0;
	private double pulse_time = 0;
	private int no_of_pulses = 0;
	private int boost_time = 0;
	private double damage_boost = 0;
	private int speed_boost = 0;
	private int create_time = 0;
	private int spell_fac_required = 0;
	private int cost = 0;
	private int radius = 0;
		
		
	public RageSpell setName(String name) {
		RageSpell.name = name;
		return this;
	}
		
	public static String getName() {
		return RageSpell.name;
	}
					
	public RageSpell setLevel(int level) {
		this.level = level;
		return this;
	}
		
	public int getLevel() {
		return this.level;
	}	

	public RageSpell setDuration(double time){
		this.duration = time;
		return this;
	}
		
	public double getDuration(){
		return this.duration;
	}
		
	public RageSpell setTimeBetweenPulses(double time){
		this.pulse_time = time;
		return this;
	}
		
	public double getTimeBetweenPulses(){
		return this.pulse_time;
	}
		
	public RageSpell setPulseAmount(int amount){
		this.no_of_pulses = amount;
		return this;
	}
		
	public int getPulseAmount(){
		return this.no_of_pulses;
	}
		
	public RageSpell setBoostTime(int time){
		this.boost_time = time;
		return this;
	}
		
	public int getBoostTime(){
		return this.boost_time;
	}
		
	public RageSpell setDamageBoost(double damage){
		this.damage_boost = damage;
		return this;
	}
	
	public double getDamageBoost(){
		return this.damage_boost;
	}
	
	public RageSpell setSpeedBoost(int speed){
		this.speed_boost = speed;
		return this;
	}
	
	public int getSpeedBoost(){
		return this.speed_boost;
	}
		
	public RageSpell setCreateTime(int time){
		this.create_time = time;
		return this;
	}
		
	public int getCreateTime(){
		return this.create_time;
	}
	
	public RageSpell setSpellFacRequired(int spellfac_level){
		this.spell_fac_required = spellfac_level;
		return this;
	}
		
	public int getSpellFacRequired(){
		return this.spell_fac_required;
	}
		
	public RageSpell setCost(int cost){
		this.cost = cost;
		return this;
	}
		
	public int getCost(){
		return this.cost;
	}
		
	public RageSpell setStrikeRadius(int radius){
		this.radius = radius;
		return this;
	}
		
	public int GetStrikeRadius(){
		return this.radius;
	}
		
	public static void  giveRageSpell(HumanEntity clicker, int amount)
	{
		Potion splash = new Potion(PotionType.STRENGTH, amount);
		ItemStack potion = splash.toItemStack(1);
		ItemMeta meta = potion.getItemMeta();
		meta.setDisplayName(RageSpell.getName());
		meta.setLore(Arrays.asList(
				"", 
				ChatColor.DARK_RED + "Enrage your units to make them", 
				ChatColor.DARK_RED + "bigger, faster and stronger!", 
				ChatColor.DARK_RED + "Cast this to create a ", 
				ChatColor.DARK_RED + "Ring of Rage! Your units will gain speed", 
				ChatColor.DARK_RED + "and attack power while they are inside this ring.", 
				ChatColor.RESET + "", 
				ChatColor.RED + "Left-Click to Use"));
		potion.setItemMeta(meta);
			
		clicker.getInventory().addItem(potion);
	}
		
	//Events
		
	@EventHandler
	public void StopConsumption(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		Action action = event.getAction();
		
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(RageSpell.getName())){
			if(action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK))
			{									
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "Why are you drinking a spell!? Do you want to Spontaneously combust!?");
								
					
			}
		}
	}
		
	@EventHandler
	public void StopBlockBreaking(BlockBreakEvent event)
	{
		Player player = event.getPlayer();
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(RageSpell.getName()))
		{
			event.setCancelled(true);
		}
			
	}
		
	@EventHandler
	public void castRageSpell(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		Action action = event.getAction();
			
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(RageSpell.getName())){
			if(action.equals(Action.LEFT_CLICK_AIR) || action.equals(Action.LEFT_CLICK_BLOCK))
			{
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1, 100));
					
					/*
					 * Add in the radius, boost time 
					 * boost amounts for speed, damage
					 * pulses and such
					 */
					
				}			
			}
		}	
}
