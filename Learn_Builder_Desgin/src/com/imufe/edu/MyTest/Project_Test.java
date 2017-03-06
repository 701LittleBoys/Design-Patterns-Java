package com.imufe.edu.MyTest;

import com.imufe.edu.beans.User;
import com.imufe.edu.daoimpl.User_DaoImpl;

public class Project_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User.UserBuilder("ÁÖ÷ë", "ÄĞ" )
				.age("20")
				.home_address("ÄÚÃÉ¹Å³à·åÊĞ")
				.build();
		
		User_DaoImpl user1_info = new User_DaoImpl();
		user1_info.create_user_info(user1);
		user1_info.display_user_info();

	}

}
