package com.inheritance.children1;
import com.inheritance.parent.*;

public class Birds extends Animal {

	private String animalWithFeathers;
	private boolean canFly;

	public Birds() {
		super();
		this.animalWithFeathers = "animalWithFeathers";
		this.canFly = true;
	}
	public Birds(String animalWithFeathers,boolean canFly,int height,int weight,String animalType,String bloodType) {
		super(height,weight,animalType,bloodType);
		this.animalWithFeathers = animalWithFeathers;
		this.canFly = canFly;
	}
	public String getAnimalWithFeathers() {
		return animalWithFeathers;
	}
	public boolean isCanFly() {
		return canFly;
	}
	
	
}
