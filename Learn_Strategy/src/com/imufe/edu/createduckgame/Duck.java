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
	//��۵ĳ�����ʽ�Ƿ�������ķ����н���ʵ��
	public abstract void display ();
	public void Fly (){
		System.out.println("~~~~���ڷ�~~~~~");
	}
}
