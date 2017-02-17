package com.imufe.edu.Product.WheelFamily_Car;

import com.imufe.edu.Product.ComponentModel.Wheel;

public class CarWheel_C extends Wheel implements Product_CarWheel {
	
	public CarWheel_C() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("Æû³µÂÖÌ¥");
		super.setWheel_size("18 ´çÊ¡ÓÍÂÖÌ¥");
		super.setProduct_price(800);
	}

	@Override
	public Wheel Create_CarWheel() {
		// TODO Auto-generated method stub
		return new CarWheel_C ();
	}

}
