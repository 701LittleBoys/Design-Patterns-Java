package com.imufe.edu.newcreateduck.concrete_realization_duck;

import com.imufe.edu.newcreateduck.flybehavior.GoodFlyBehacior;
import com.imufe.edu.newcreateduck.quackbehavior.GaGaQuackBehavior;
import com.imufe.edu.newcreateduckgame.duck.Duck;

public class NewGreenHeadDuck extends Duck {

	public NewGreenHeadDuck(){
		mFlyBehavior = new GoodFlyBehacior();
		this.mQuackbehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我的头发是绿色的");
	}

}
