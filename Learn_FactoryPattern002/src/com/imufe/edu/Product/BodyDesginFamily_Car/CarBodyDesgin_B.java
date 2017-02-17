package com.imufe.edu.Product.BodyDesginFamily_Car;

import com.imufe.edu.Product.ComponentModel.BodyDesgin;

public class CarBodyDesgin_B extends BodyDesgin implements Product_CarBodyDesgin {
	
	public CarBodyDesgin_B() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("汽车车身");
		super.setBodydesgin_style("三厢车");
		super.setProduct_price(10000);
	}

	@Override
	public BodyDesgin Create_CarBodyDesgin() {
		// TODO Auto-generated method stub
		return new CarBodyDesgin_B();
	}

}
