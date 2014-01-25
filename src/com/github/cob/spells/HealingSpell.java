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
import org.bukkit.potion.PotionType;


public class HealingSpell implements Listener {
	
	
	private static String name = ChatColor.GOLD + ChatColor.BOLD.toString() + "Healing Spell";
	private int level = 1;
	private double duration = 0;
	private double pulse_time = 0;
	private int no_of_pulses = 0;
	private int total_healing = 0;
	private int heal_per_pulse = 0;
	private int create_time = 0;
	private int spell_fac_required = 0;
	private int cost = 0;
	private int radius = 0;
		
		
	public HealingSpell setName(String name) {
		HealingSpell.name = name;
		return this;
	}
		
	public static String getName() {
		return HealingSpell.name;
	}
					
	public HealingSpell setLevel(int level) {
		this.level = level;
		return this;
	}
		
	public int getLevel() {
		return this.level;
	}	

	public HealingSpell setDuration(double time){
		this.duration = time;
		return this;
	}
		
	public double getDuration(){
		return this.duration;
	}
		
	public HealingSpell setTimeBetweenPulses(double time){
		this.pulse_time = time;
		return this;
	}
		
	public double getTimeBetweenPulses(){
		return this.pulse_time;
	}
		
	public HealingSpell setPulseAmount(int amount){
		this.no_of_pulses = amount;
		return this;
	}
		
	public int getPulseAmount(){
		return this.no_of_pulses;
	}
		
	public HealingSpell setTotalHealing(int total){
		this.total_healing = total;
		return this;
	}
		
	public int getTotalHealing(){
		return this.total_healing;
	}
		
	public HealingSpell setHealPerPulse(int heal){
		this.heal_per_pulse = heal;
		return this;
	}
	
	public int getHealPerPulse(){
		return this.heal_per_pulse;
	}		
		
	public HealingSpell setCreateTime(int time){
		this.create_time = time;
		return this;
	}
		
	public int getCreateTime(){
		return this.create_time;
	}
	
	public HealingSpell setSpellFacRequired(int spellfac_level){
		this.spell_fac_required = spellfac_level;
		return this;
	}
		
	public int getSpellFacRequired(){
		return this.spell_fac_required;
	}
		
	public HealingSpell setCost(int cost){
		this.cost = cost;
		return this;
	}
		
	public int getCost(){
		return this.cost;
	}
		
	public HealingSpell setStrikeRadius(int radius){
		this.radius = radius;
		return this;
	}
		
	public int GetStrikeRadius(){
		return this.radius;
	}
		
	public static void  giveHealingSpell(HumanEntity clicker, int amount)
	{
		Potion splash = new Potion(PotionType.INSTANT_HEAL, amount);
		ItemStack potion = splash.toItemStack(1);
		ItemMeta meta = potion.getItemMeta();
		meta.setDisplayName(HealingSpell.getName());
		meta.setLore(Arrays.asList(
				ChatColor.GREEN +"", 
				ChatColor.GREEN + "Heal your Troops to keep them ", 
				ChatColor.GREEN + "in the fight!", 
				ChatColor.GREEN+ "Cast this spell to create", 
				ChatColor.GREEN+ "a Ring of Healing. Your units will be",
				ChatColor.GREEN+ "healed while they are inside this ring.", 
				ChatColor.RESET+ "", 
				ChatColor.RED+ "Left-Click to Use"));
		potion.setItemMeta(meta);
			
		clicker.getInventory().addItem(potion);
	}
		
	//Events
		
	@EventHandler
	public void StopConsumption(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		Action action = event.getAction();
		
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(HealingSpell.getName())){
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
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(HealingSpell.getName()))
		{
			event.setCancelled(true);
		}
			
	}
		
	@EventHandler
	public void castHealingSpell(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		Action action = event.getAction();
			
		if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(HealingSpell.getName())){
			if(action.equals(Action.LEFT_CLICK_AIR) || action.equals(Action.LEFT_CLICK_BLOCK))
			{
				player.setHealth(20.0);
				player.setFireTicks(0);
					
					/*
					 * Add in the radius, pulses, 
					 * total time, healing ect
					 * got to wait for troops to be added
					 */
					
				}			
			}
		}	
}
