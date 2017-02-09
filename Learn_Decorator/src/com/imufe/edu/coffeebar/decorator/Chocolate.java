package com.imufe.edu.coffeebar.decorator;

import com.imufe.edu.coffeebar.basic.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}

}
