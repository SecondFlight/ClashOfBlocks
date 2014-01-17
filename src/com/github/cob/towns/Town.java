package com.github.cob.towns;

import com.github.cob.buildings.Building;

public class Town {
	
	private String name = "Unknown's Town";
	private Building[] buildings = new Building[2048];
	private int shieldExpireStamp = 0;
	private int posX = 0;
	private int posY = 0;
	private int posZ = 0;
	private int width = 0;
	private int height = 0;
	
	public Town(String name, Building[] buildings, int shieldExpireStamp) {
		this.name = name;
		this.buildings = buildings;
		this.shieldExpireStamp = shieldExpireStamp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Building[] getBuildings() {
		return this.buildings;
	}
	
	public void addBuilding(Building building) {
		int pos = 0;
		for (Building build : this.getBuildings()) {
			if (build != null) {
				pos++;
				continue;
			}
			this.getBuildings()[pos] = building;
			break;
		}
	}
	
	public int getShieldExpireStamp() {
		return this.shieldExpireStamp;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public int getPosZ() {
		return this.posZ;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
}
