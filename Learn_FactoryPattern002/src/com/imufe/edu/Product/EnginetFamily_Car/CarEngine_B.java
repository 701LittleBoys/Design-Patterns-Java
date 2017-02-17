package com.imufe.edu.Product.EnginetFamily_Car;

import com.imufe.edu.Product.ComponentModel.Engine;

public class CarEngine_B extends Engine implements Product_CarEngine {

	public CarEngine_B() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("汽车引擎");
		super.setHorse_power("400马力");
		super.setEngine_construction("V形八缸涡轮增压");
		super.setEngine_capacity("4.0 升");
		super.setRotating_speed("8000 r/min");
		super.setProduct_price(10000);
	}
	
	@Override
	public Engine Create_CarEngine() {
		// TODO Auto-generated method stub
		return new CarEngine_B();
	}

}
