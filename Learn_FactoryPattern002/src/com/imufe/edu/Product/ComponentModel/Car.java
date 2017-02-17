package com.imufe.edu.Product.ComponentModel;

import com.imufe.edu.Product.BodyDesginFamily_Car.Product_CarBodyDesgin;
import com.imufe.edu.Product.EnginetFamily_Car.Product_CarEngine;
import com.imufe.edu.Product.WheelFamily_Car.Product_CarWheel;
import com.imufe.edu.ProductBasic.ProductOrigin;

public class Car extends ProductOrigin {
	
	private String car_name;
	private Engine car_engine;
	private Wheel car_wheel;
	private BodyDesgin car_bodydesgin;
	private float car_price;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*public Car(Product_CarBodyDesgin bodydesgin , Product_CarEngine engine,Product_CarWheel wheel , float car_price){
		this.car_engine = (Engine) engine;
		this.car_bodydesgin = (BodyDesgin) bodydesgin;
		this.car_wheel = (Wheel) wheel;
		this.car_price = car_price;
		
	}*/
	
	
	

	public Engine getCar_engine() {
		return car_engine;
	}




	public void setCar_engine(Engine car_engine) {
		this.car_engine = car_engine;
	}


	public void setCar_wheel(Wheel car_wheel) {
		this.car_wheel = car_wheel;
	}


	public void setCar_bodydesgin(BodyDesgin car_bodydesgin) {
		this.car_bodydesgin = car_bodydesgin;
	}


	public void setCar_price(float car_price) {
		this.car_price = car_price;
	}


	public Wheel getCar_wheel() {
		return car_wheel;
	}




	public BodyDesgin getCar_bodydesgin() {
		return car_bodydesgin;
	}




	public float getCar_price() {
		return car_price;
	}




	@Override
	public float getProduct_Cost() {
		// TODO Auto-generated method stub
		float result = this.getCar_bodydesgin().getProduct_Cost() +
				this.getCar_engine().getProduct_Cost() + 
				this.getCar_wheel().getProduct_Cost()+
				this.getCar_price();
		return result;
	}

	@Override
	public void getProduct_Info() {
		// TODO Auto-generated method stub
		this.getCar_Info();
	}
	public void getCar_Info (){
		this.getCar_wheel().getProduct_Info();
		this.getCar_engine().getProduct_Info();
		this.getCar_bodydesgin().getProduct_Info();
	}


	public String getCar_name() {
		return car_name;
	}


	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

}
