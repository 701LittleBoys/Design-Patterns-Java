package com.imufe.edu.Product.BodyDesginFamily_Car;

import com.imufe.edu.Product.ComponentModel.BodyDesgin;

public class CarBodyDesgin_C extends BodyDesgin implements Product_CarBodyDesgin {
	
	public CarBodyDesgin_C() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("汽车车身");
		super.setBodydesgin_style("越野车");
		super.setProduct_price(15000);
	}

	@Override
	public BodyDesgin Create_CarBodyDesgin() {
		// TODO Auto-generated method stub
		return new CarBodyDesgin_C();
	}

}
