package com.inheritance.children2;
import com.inheritance.children1.*;

public class Eagle extends Birds{
	

	public Eagle(String animalWithFeathers,boolean canFly,int height,int weight,String animalType,String bloodType) {
		super(animalWithFeathers,canFly,height,weight,animalType,bloodType);

}
	
	public String showInfo() {
		 return "Eagle [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
		+ ", getBloodType()=" + getBloodType() + ", getAnimalWithFeathers()=" + getAnimalWithFeathers() + ", isCanFly()=" + isCanFly()
		+ "]";
	}

}
