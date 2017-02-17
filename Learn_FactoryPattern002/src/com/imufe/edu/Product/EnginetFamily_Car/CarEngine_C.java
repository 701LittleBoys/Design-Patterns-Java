package com.imufe.edu.Product.EnginetFamily_Car;

import com.imufe.edu.Product.ComponentModel.Engine;

public class CarEngine_C extends Engine implements Product_CarEngine {
	
	
	public CarEngine_C() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("汽车引擎");
		super.setHorse_power("800马力");
		super.setEngine_construction("W形12缸");
		super.setEngine_capacity("6.0 升");
		super.setRotating_speed("9000 r/min");
		super.setProduct_price(15000);
	}
	

	@Override
	public Engine Create_CarEngine() {
		// TODO Auto-generated method stub
		return new CarEngine_C();
	}

}
