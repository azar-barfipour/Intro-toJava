package com.inheritance.children2;
import com.inheritance.children1.*;

public class Corcodile extends Reptile{
	private String hardShellEgges;
	
	public Corcodile() {
		super();
		this.hardShellEgges = "hardShellEgges";
	}
	public Corcodile(String hardShellEgges,String drySkin,String backbone,boolean softshellEgg,int height,int weight,String animalType,String bloodType) {
		super(drySkin,backbone,softshellEgg,height,weight,animalType,bloodType);
		this.hardShellEgges = hardShellEgges;

}
	
	public String showInfo() {
		 return "Corcodile [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType()
		+ ", getBloodType()=" + getBloodType() + ", getDrySkin()=" + getDrySkin() + ", getBackbone()=" + getBackbone()+ ", isSoftshellEgg()=" + getBackbone()
		+ "]";
	}
}