package com.imufe.edu.Product.WheelFamily_Car;

import com.imufe.edu.Product.ComponentModel.Wheel;

public class CarWheel_A extends Wheel implements Product_CarWheel {
	
	public CarWheel_A() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("Æû³µÂÖÌ¥");
		super.setWheel_size("15 ´çÔ½Ò°ÂÖÌ¥");
		super.setProduct_price(500);
	}

	@Override
	public Wheel Create_CarWheel() {
		// TODO Auto-generated method stub
		return new CarWheel_A();
	}

}
