package com.imufe.edu.Product.ComponentModel;

import com.imufe.edu.ProductBasic.ProductOrigin;

public class Wheel extends ProductOrigin {
	
	private String wheel_size;
	
	
	public Wheel (){
		super.setProduct_name("��̥");
	}
	

	public String getWheel_size() {
		return wheel_size;
	}

	public void setWheel_size(String wheel_size) {
		this.wheel_size = wheel_size;
	}

	@Override
	public float getProduct_Cost() {
		// TODO Auto-generated method stub
		return super.getProduct_price();
	}
	
	public void getWheel_Info (){
		System.out.println("======== ������Ϣ  ===========");
		System.out.println("���ֳߴ� == " + this.getWheel_size() );
		System.out.println("���ּ۸� == " + this.getProduct_Cost());
	}


	@Override
	public void getProduct_Info() {
		// TODO Auto-generated method stub
		this.getWheel_Info();
	}

}
