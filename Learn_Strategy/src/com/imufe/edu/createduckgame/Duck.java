package com.imufe.edu.createduckgame;

public abstract class Duck {
	public Duck (){
		
	}
	public void Quack (){
		System.out.println("~~~~~gaga~~~~~");
	}
	public void swim (){
		System.out.println("~~~~in swim ~~~~");
	}
	//外观的抽象形式是放在子类的方法中进行实现
	public abstract void display ();
	public void Fly (){
		System.out.println("~~~~正在飞~~~~~");
	}
}
