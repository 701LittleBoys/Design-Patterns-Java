package com.imufe.edu.Product.EnginetFamily_Car;

import com.imufe.edu.Product.ComponentModel.Engine;

public class CarEngine_A extends Engine implements Product_CarEngine {
	
	public CarEngine_A() {
		// TODO Auto-generated constructor stub
		super.setProduct_name("��������");
		super.setHorse_power("200����");
		super.setEngine_construction("ֱ���ĸ�");
		super.setEngine_capacity("2.0 ��");
		super.setRotating_speed("6000 r/min");
		super.setProduct_price(5000);
	}

	@Override
	public Engine Create_CarEngine() {
		// TODO Auto-generated method stub
		return new CarEngine_A();
	}

}
