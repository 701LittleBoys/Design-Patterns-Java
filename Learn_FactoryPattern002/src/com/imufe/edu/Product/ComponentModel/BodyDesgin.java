package com.imufe.edu.Product.ComponentModel;

import com.imufe.edu.ProductBasic.ProductOrigin;

public class BodyDesgin extends ProductOrigin {
	
	private String bodydesgin_style;
	
	

	public String getBodydesgin_style() {
		return bodydesgin_style;
	}



	public void setBodydesgin_style(String bodydesgin_style) {
		this.bodydesgin_style = bodydesgin_style;
	}



	@Override
	public float getProduct_Cost() {
		// TODO Auto-generated method stub
		return super.getProduct_price();
	}
	
	public void getBodyDesgin_Info(){
		System.out.println("========= ������������Ϣ   ======");
		System.out.println("���������ʽ == " + this.getBodydesgin_style());
		System.out.println("������۸� == " + this.getProduct_Cost());
	}



	@Override
	public void getProduct_Info() {
		// TODO Auto-generated method stub
		this.getBodyDesgin_Info();
	}

}
