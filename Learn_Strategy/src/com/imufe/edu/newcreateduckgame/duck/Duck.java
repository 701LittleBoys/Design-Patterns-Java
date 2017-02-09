package com.imufe.edu.newcreateduckgame.duck;

import com.imufe.edu.newcreateduck.flybehavior.FlyBehavior;
import com.imufe.edu.newcreateduck.quackbehavior.Quackbehavior;

public abstract class Duck {
	protected FlyBehavior mFlyBehavior;
	protected Quackbehavior mQuackbehavior;
	public Duck (){
		
	}
	public void Fly (){
		this.mFlyBehavior.fly();
	}
	public void Quack (){
		this.mQuackbehavior.quack();
	}
	public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
		this.mFlyBehavior = mFlyBehavior;
	}
	public void setmQuackbehavior(Quackbehavior mQuackbehavior) {
		this.mQuackbehavior = mQuackbehavior;
	}
	public void swim (){
		System.out.println("ÔÚË®Àï");
	}
	public abstract void display ();
}
