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
	
	//������װ���ߵķ���
	//������Ʒ���߱���װ�ĵ�Ʒ
	public abstract float cost ();
	

}
