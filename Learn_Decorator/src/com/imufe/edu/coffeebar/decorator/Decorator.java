package com.imufe.edu.coffeebar.decorator;

import com.imufe.edu.coffeebar.basic.Drink;

public class Decorator extends Drink {

	private Drink Obj;
	
	public Decorator (Drink obj){
		this.Obj = obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice() + this.Obj.cost();
	}
	
	public String getDescription (){
		return super.description + "-" + super.getPrice() + "&&" + this.Obj.getDescription();
	}

}
