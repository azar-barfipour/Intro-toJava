package com.inheritance.children2;
import com.inheritance.children1.*;

public class Eel extends Fish{
private String releaseElChange;
	
	public Eel() {
		super();
		this.releaseElChange = "releaseElChange";
	}
	public Eel(String releaseElChange,String liveInWater,boolean hasGill,int height,int weight,String animalType,String bloodType) {
		super(liveInWater,hasGill,height,weight,animalType,bloodType);
		this.releaseElChange = releaseElChange;

}
	
	public String showInfo() {
		 return "Eel [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
		+ ", getBloodType()=" + getBloodType() + ", getLiveInWater()=" + getLiveInWater() + ", isHasGill()=" + isHasGill()
		+ "]";
	}

}
