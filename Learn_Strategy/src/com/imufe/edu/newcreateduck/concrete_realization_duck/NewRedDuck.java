package com.imufe.edu.newcreateduck.concrete_realization_duck;

import com.imufe.edu.newcreateduck.flybehavior.BadFlyBehavior;
import com.imufe.edu.newcreateduck.quackbehavior.GuGuQuackBehavior;
import com.imufe.edu.newcreateduckgame.duck.Duck;

public class NewRedDuck extends Duck {
	
	public NewRedDuck() {
		// TODO Auto-generated constructor stub
		this.mFlyBehavior = new BadFlyBehavior();
		this.mQuackbehavior = new GuGuQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我的头发是红色的");
	}

}
