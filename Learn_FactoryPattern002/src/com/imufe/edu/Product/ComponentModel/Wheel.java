package com.imufe.edu.Product.ComponentModel;

import com.imufe.edu.ProductBasic.ProductOrigin;

public class Wheel extends ProductOrigin {
	
	private String wheel_size;
	
	
	public Wheel (){
		super.setProduct_name("轮胎");
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
		System.out.println("======== 车轮信息  ===========");
		System.out.println("车轮尺寸 == " + this.getWheel_size() );
		System.out.println("车轮价格 == " + this.getProduct_Cost());
	}


	@Override
	public void getProduct_Info() {
		// TODO Auto-generated method stub
		this.getWheel_Info();
	}

}
