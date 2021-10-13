package com.inheritance.children1;
import com.inheritance.parent.*;

public class Reptile extends Animal  {
	
	private String drySkin;
	private String backbone;
	private boolean softshellEgg;

	public Reptile() {
		super();
		this.drySkin = "";
		this.backbone = "";
		this.softshellEgg = true;
	}
	public Reptile(String drySkin,String backbone,boolean softshellEgg,int height,int weight,String animalType,String bloodType) {
		super(height,weight,animalType,bloodType);
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.softshellEgg = softshellEgg;
	}
	public String getDrySkin() {
		return drySkin;
	}
	public String getBackbone() {
		return backbone;
	}
	public boolean isSoftshellEgg() {
		return softshellEgg;
	}
	

}
