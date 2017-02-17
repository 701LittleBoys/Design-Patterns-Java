package com.imufe.edu.Product.WheelFamily_Car;

import com.imufe.edu.Product.ComponentModel.Wheel;

public class CarWheel_B extends Wheel implements Product_CarWheel {
	
	public CarWheel_B() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("Æû³µÂÖÌ¥");
		super.setWheel_size("20 ´ç¾º¼¼ÂÖÌ¥");
		super.setProduct_price(1000);
	}

	@Override
	public Wheel Create_CarWheel() {
		// TODO Auto-generated method stub
		return new CarWheel_B();
	}

}
