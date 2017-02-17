package com.imufe.edu.Test;

import com.imufe.edu.Factory.FactoryFamily.Factory_A;
import com.imufe.edu.Product.ComponentModel.Car;
import com.imufe.edu.Product.ComponentModel.Engine;
import com.imufe.edu.Product.ComponentModel.Wheel;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory_A factory_001 = new Factory_A();
		Engine first_engine = (Engine)factory_001.create_ProductEngine();
		Wheel first_wheel = (Wheel) factory_001.create_ProductWheel();
		Car first_car = (Car) factory_001.create_ProductCar();
		
		
		/*first_engine.getEngine_Info();
		
		first_wheel.getWheel_Info();*/
		
		System.out.println("制造厂的信息 ==== " + factory_001.getFactory_name());
		
		first_car.getCar_Info();
	}

}
