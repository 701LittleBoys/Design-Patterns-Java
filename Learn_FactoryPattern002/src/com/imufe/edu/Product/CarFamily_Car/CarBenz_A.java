package com.imufe.edu.Product.CarFamily_Car;


import com.imufe.edu.Product.BodyDesginFamily_Car.CarBodyDesgin_B;
import com.imufe.edu.Product.ComponentModel.Car;
import com.imufe.edu.Product.EnginetFamily_Car.CarEngine_B;
import com.imufe.edu.Product.WheelFamily_Car.CarWheel_B;

public class CarBenz_A extends Car implements Product_CarCar {
	public CarBenz_A() throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated constructor stub
		super.setProduct_name("汽车整车");
		super.setCar_name("Benz-----------C系180");
		super.setCar_bodydesgin(CarBodyDesgin_B.class.newInstance());
		super.setCar_engine(CarEngine_B.class.newInstance());
		super.setCar_wheel(CarWheel_B.class.newInstance());
		super.setCar_price(20);
	}
	@Override
	public Car Create_Car() {
		// TODO Auto-generated method stub
		try {
			return new CarBenz_A();
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
