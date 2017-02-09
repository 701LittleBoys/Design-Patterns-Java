package com.imufe.edu.coffeebar.decorator;

import com.imufe.edu.coffeebar.basic.Drink;

public class Soy extends Decorator {

	public Soy(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Soy");
		super.setPrice(2.0f);
	}

}
