package com.imufe.edu.singleton;

public class ChocolateFactory {
	private boolean pan_empty;
	private boolean pan_boiled;
	
	//“急切”创建法
	//private static ChocolateFactory uniqueInstance = new ChocolateFactory();
	private volatile static ChocolateFactory uniqueInstance = null;
	
	private ChocolateFactory (){
		this.pan_boiled = false;
		this.pan_empty = true;
	}
	
	//如果要防止多线程运行而导致的不唯一性的问题，最简单的方式就是加载同步锁
	/*
	 * 但是这种方法的缺点也很明显，就是同步锁需要消耗的资源很多，而导致多用户状态下
	 * 的用户体验极差
	 */
	/*
	public static synchronized ChocolateFactory getInstance (){
		if (uniqueInstance == null){
			uniqueInstance = new ChocolateFactory();
		}
		return uniqueInstance;
	}
	*/
	
	public static synchronized ChocolateFactory getInstance (){
		if (uniqueInstance == null){
			synchronized (ChocolateFactory.class)
			{
				if (uniqueInstance == null){
					uniqueInstance = new ChocolateFactory();
				}
			}
		}
		return uniqueInstance;
	}
	
	//此函数是添加原料
	public void add_fill (){
		if (this.pan_empty){
			this.pan_empty = false;
			this.pan_boiled = false;
		}
	}
	
	//此函数是对锅进行加热
	public void pan_boil (){
		if (this.pan_empty != true && this.pan_boiled != true){
			this.pan_boiled = true;
		}
	}
	
	//此函数是对锅中的巧克力进行排出
	public void pan_drain (){
		if (this.pan_empty != true && this.pan_boiled == true){
			this.pan_empty = true;
		}
	}

}
