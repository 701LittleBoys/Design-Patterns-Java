package Test;

import com.imufe.edu.coffeebar.basic.Drink;
import com.imufe.edu.coffeebar.coffee.Decaf;
import com.imufe.edu.coffeebar.coffee.LongBlack;
import com.imufe.edu.coffeebar.decorator.Chocolate;
import com.imufe.edu.coffeebar.decorator.Milk;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drink order;
		order = new Decaf();
		
		System.out.println("ordre订单的价格是多少：" + order.cost());
		System.out.println("order订单的详尽信息：" + order.getDescription());
		
		
		/*
		 * 具体需求：配置一杯卡布奇诺咖啡
		 * 一份黑咖啡，一份牛奶，二份巧克力
		 */
		System.out.println("-----------------这是美丽的分割线-------------------");
		Drink order2;
		order2 = new LongBlack ();
		order2 = new Milk (order2);
		order2 = new Chocolate(order2);
		order2 = new Chocolate(order2);
		System.out.println("order2 订单的价格是多少：" + order2.cost());
		System.out.println("order2 订单的详尽信息： " + order2.getDescription());
	}

}
