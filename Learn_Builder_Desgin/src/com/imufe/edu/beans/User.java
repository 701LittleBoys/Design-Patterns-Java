package com.imufe.edu.beans;


/**
 * 
 * @author 95262
 * 
 * javaBean：User
 *
 */
public class User {
	private final String user_name;
	private final String user_sex;
	private final String user_age;
	private final String user_home_address;
	
	private  User(UserBuilder builder) {
		// TODO Auto-generated constructor stub
		this.user_name = builder.user_name;
		this.user_age = builder.user_age;
		this.user_sex = builder.user_sex;
		this.user_home_address = builder.user_home_address;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public String getUser_age() {
		return user_age;
	}
	public String getUser_home_address() {
		return user_home_address;
	}
	
	
	
	/*
	 * 
	 * 此处有坑，我们需要了解public static class 的具体应用，这里是一种static的灵活应用，
	 * 具体的变化，需要查看博客；
	 * 
	 */
	
	public static class UserBuilder {
		
		public final String user_name;
		public final String user_sex;
		public String user_home_address;
		public String user_age;
		
		/*
		 * 通过 构建者的工具类 来实现构建 User类的具体工作
		 * 实质：相当于搭建楼房的民工，通过民工来构建什么楼房
		 */
		public UserBuilder(String user_name,String user_sex) {
			// TODO Auto-generated constructor stub
			this.user_name = user_name;
			this.user_sex = user_sex;
		}
		
		public UserBuilder age (String user_age)
		{
			this.user_age = user_age;
			return this;
		}
		
		public UserBuilder home_address (String user_home_address)
		{
			this.user_home_address = user_home_address;
			return this;
		}
		
		/*
		 * 通过 最后的build()方法来达到构建一个满足我们自定义话的对象，
		 * 而对象的具体内容我们是不可兼得
		 */
		public User build ()
		{
			return new User(this);
			
		}

	}
	


}
