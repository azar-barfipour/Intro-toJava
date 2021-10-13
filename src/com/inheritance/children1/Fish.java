package com.inheritance.children1;

import com.inheritance.parent.Animal;

public class Fish extends Animal{

	private String liveInWater;
	private boolean hasGill;

	public Fish() {
		super();
		this.liveInWater = "liveInWater";
		this.hasGill = true;
	}
	public Fish(String liveInWater,boolean hasGill,int height,int weight,String animalType,String bloodType) {
		super(height,weight,animalType,bloodType);
		this.liveInWater = liveInWater;
		this.hasGill = hasGill;
	}
	public String getLiveInWater() {
		return liveInWater;
	}
	public boolean isHasGill() {
		return hasGill;
	}
	

}
