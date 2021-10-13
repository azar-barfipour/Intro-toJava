package com.inheritance;

import com.inheritance.children2.Eagle;

public class Main {

	public static void main(String[] args) {
		Eagle eagle = new Eagle("animalWithFeathers",true,15,20,"bird","O+");
		System.out.println(eagle.showInfo());

	}

}
