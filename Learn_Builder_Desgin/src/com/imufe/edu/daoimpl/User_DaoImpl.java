package com.imufe.edu.daoimpl;

import com.imufe.edu.beans.User;
import com.imufe.edu.dao.build_user_info;
import com.imufe.edu.dao.show_user_info;

public class User_DaoImpl implements show_user_info , build_user_info {
	
	private User user;
	
	public User_DaoImpl() {
		//TODO Auto-generated method stub
		
	}

	@Override
	public void display_user_info() {
		
		// TODO Auto-generated constructor stub
				System.out.println("用户的姓名  = " + user.getUser_name());
				System.out.println("用户的性别 = " + user.getUser_sex());
				if (user.getUser_age() != null)
				{
					System.out.println("用户的年龄 = " +  user.getUser_age());
				}
				if (user.getUser_home_address() != null)
				{
					System.out.println("用户的家庭住址 = " + user.getUser_home_address());
				}
		
	}

	@Override
	public void create_user_info(User user) {
		// TODO Auto-generated method stub
		
		this.user = user;
		
	}
	

}
