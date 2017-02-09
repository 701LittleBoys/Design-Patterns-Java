package com.imufe.edu.coffeebar.basic;

public abstract class Drink {
	public String description = "";
	private float price = 0;
	public String getDescription() {
		return description + "======>>>" + this.getPrice();
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	//描述被装饰者的方法
	//描述单品或者被包装的单品
	public abstract float cost ();
	

}
