package com.imufe.edu.FactoryPattern.SimplyFactory;

import com.imufe.edu.FactoryPattern.Food.Chips;
import com.imufe.edu.FactoryPattern.Food.McChicken;
import com.imufe.edu.FactoryPattern.Impl.Food;

public class SimplyFactory {
	public static Food make_food (String type) throws InstantiationException, IllegalAccessException{
		if (type.equalsIgnoreCase("mcchicken")){
			return McChicken.class.newInstance();
		}
		else if (type.equalsIgnoreCase("chips")){
			return Chips.class.newInstance();
		}
		else{
			System.out.println("暂时没有此食物");
			return null;
		}
	}
}
