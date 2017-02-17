package com.imufe.edu.Product.ComponentModel;

import com.imufe.edu.ProductBasic.ProductOrigin;

public class Engine extends ProductOrigin {
	
	private String rotating_speed;
	private String horse_power;
	private String engine_capacity;
	private String engine_construction;
	
	

	public String getRotating_speed() {
		return rotating_speed;
	}


	public void setRotating_speed(String rotating_speed) {
		this.rotating_speed = rotating_speed;
	}


	public String getHorse_power() {
		return horse_power;
	}


	public void setHorse_power(String horse_power) {
		this.horse_power = horse_power;
	}


	public String getEngine_capacity() {
		return engine_capacity;
	}


	public void setEngine_capacity(String engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	public String getEngine_construction() {
		return engine_construction;
	}


	public void setEngine_construction(String engine_construction) {
		this.engine_construction = engine_construction;
	}


	@Override
	public float getProduct_Cost() {
		// TODO Auto-generated method stub
		return super.getProduct_price();
	}
	
	public void getEngine_Info() {
		System.out.println("================== ����ľ�����Ϣ ================== ");
		System.out.println("��������� == " + this.getEngine_capacity());
		System.out.println("�����ת�� == " + this.getRotating_speed());
		System.out.println("��������� == " + this.getHorse_power());
		System.out.println("����Ĺ��� == " + this.getEngine_construction());
		System.out.println("����۸� == " + this.getProduct_Cost());
	}


	@Override
	public void getProduct_Info() {
		// TODO Auto-generated method stub
		this.getEngine_Info();
	}

}
