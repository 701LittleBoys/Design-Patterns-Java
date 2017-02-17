package com.imufe.edu.Product.CarFamily_Car;

import com.imufe.edu.Product.BodyDesginFamily_Car.CarBodyDesgin_A;
import com.imufe.edu.Product.ComponentModel.Car;
import com.imufe.edu.Product.EnginetFamily_Car.CarEngine_A;
import com.imufe.edu.Product.WheelFamily_Car.CarWheel_A;


public class CarBMW_A extends Car implements Product_CarCar {
	
	public CarBMW_A() throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated constructor stub
		super.setProduct_name("汽车整车");
		super.setCar_name("BMW-----------1系----120I");
		super.setCar_bodydesgin(CarBodyDesgin_A.class.newInstance());
		super.setCar_engine(CarEngine_A.class.newInstance());
		super.setCar_wheel(CarWheel_A.class.newInstance());
		super.setCar_price(10);
	}

	@Override
	public Car Create_Car() {
		// TODO Auto-generated method stub
		try {
			return new CarBMW_A();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
