package com.imufe.edu.Product.BodyDesginFamily_Car;

import com.imufe.edu.Product.ComponentModel.BodyDesgin;

public class CarBodyDesgin_C extends BodyDesgin implements Product_CarBodyDesgin {
	
	public CarBodyDesgin_C() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("��������");
		super.setBodydesgin_style("ԽҰ��");
		super.setProduct_price(15000);
	}

	@Override
	public BodyDesgin Create_CarBodyDesgin() {
		// TODO Auto-generated method stub
		return new CarBodyDesgin_C();
	}

}
