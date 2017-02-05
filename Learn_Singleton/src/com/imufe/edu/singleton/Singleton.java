package com.imufe.edu.singleton;

public class Singleton {
	
	private static Singleton uniqeInstance = null;
	
	private Singleton (){
		
	};
	
	public static Singleton getInstance (){
		/*
		首先判断第一次调用的对象是不是空，如何为空，就是第一次创建，需要进行new操作；
		如果不为空，就是已经创建完成，直接返回对象就可以
		*/
		if (uniqeInstance == null){
			uniqeInstance = new Singleton ();
		}
		return uniqeInstance;
		
	}

}
