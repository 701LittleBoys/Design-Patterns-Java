package com.imufe.edu.ProductBasic;

public abstract class ProductOrigin {
	private String product_name;
	private float product_price;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	
	public abstract float getProduct_Cost (); 
	public abstract void getProduct_Info ();
	
}
