package com.imufe.edu.Factory.FactoryFamily;

import com.imufe.edu.FactoryBasic.FactoryOrigin;
import com.imufe.edu.Product.CarFamily_Car.CarBMW_A;
import com.imufe.edu.Product.CarFamily_Car.Product_CarCar;
import com.imufe.edu.Product.EnginetFamily_Car.CarEngine_C;
import com.imufe.edu.Product.EnginetFamily_Car.Product_CarEngine;
import com.imufe.edu.Product.WheelFamily_Car.CarWheel_A;
import com.imufe.edu.Product.WheelFamily_Car.Product_CarWheel;

public class Factory_A extends FactoryOrigin implements Factory_EngineProduct,Factory_WheelProduct,Factory_CarProduct{
	
	public Factory_A (){
		this.setFactory_name();
	}
	
	@Override
	public void setFactory_name() {
		// TODO Auto-generated method stub
		super.setFactory_name("德国宝马综合制造厂");
	}

	@Override
	public Product_CarEngine create_ProductEngine() {
		// TODO Auto-generated method stub
		try {
			return (Product_CarEngine) CarEngine_C.class.newInstance().Create_CarEngine();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product_CarWheel create_ProductWheel() {
		// TODO Auto-generated method stub
		try {
			return (Product_CarWheel) CarWheel_A.class.newInstance().Create_CarWheel();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product_CarCar create_ProductCar() {
		// TODO Auto-generated method stub
		try {
			return (Product_CarCar) CarBMW_A.class.newInstance().Create_Car();
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
