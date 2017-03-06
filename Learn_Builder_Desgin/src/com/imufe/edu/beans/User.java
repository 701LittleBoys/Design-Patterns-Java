package com.imufe.edu.beans;


/**
 * 
 * @author 95262
 * 
 * javaBean��User
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
	 * �˴��пӣ�������Ҫ�˽�public static class �ľ���Ӧ�ã�������һ��static�����Ӧ�ã�
	 * ����ı仯����Ҫ�鿴���ͣ�
	 * 
	 */
	
	public static class UserBuilder {
		
		public final String user_name;
		public final String user_sex;
		public String user_home_address;
		public String user_age;
		
		/*
		 * ͨ�� �����ߵĹ����� ��ʵ�ֹ��� User��ľ��幤��
		 * ʵ�ʣ��൱�ڴ¥�����񹤣�ͨ����������ʲô¥��
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
		 * ͨ�� ����build()�������ﵽ����һ�����������Զ��廰�Ķ���
		 * ������ľ������������ǲ��ɼ��
		 */
		public User build ()
		{
			return new User(this);
			
		}

	}
	


}
