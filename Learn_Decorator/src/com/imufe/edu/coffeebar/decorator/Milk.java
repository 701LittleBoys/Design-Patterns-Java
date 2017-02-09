package com.imufe.edu.coffeebar.decorator;

import com.imufe.edu.coffeebar.basic.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}
