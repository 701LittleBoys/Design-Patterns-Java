package com.imufe.edu.FactoryPattern.Text;

import com.imufe.edu.FactoryPattern.Impl.Food;
import com.imufe.edu.FactoryPattern.SimplyFactory.SimplyFactory;

public class myTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Food mcchicken = SimplyFactory.make_food("mcchicken");
		Food chips = SimplyFactory.make_food("chips");
		Food ice_cream = SimplyFactory.make_food("ice_cream");
		
		//后台收到的订单
		mcchicken.getFood();
		chips.getFood();
		if (ice_cream!=null)
		{
			ice_cream.getFood();
		}
	}

}
