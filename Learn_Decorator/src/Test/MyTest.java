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
		
		System.out.println("ordre�����ļ۸��Ƕ��٣�" + order.cost());
		System.out.println("order�������꾡��Ϣ��" + order.getDescription());
		
		
		/*
		 * ������������һ��������ŵ����
		 * һ�ݺڿ��ȣ�һ��ţ�̣������ɿ���
		 */
		System.out.println("-----------------���������ķָ���-------------------");
		Drink order2;
		order2 = new LongBlack ();
		order2 = new Milk (order2);
		order2 = new Chocolate(order2);
		order2 = new Chocolate(order2);
		System.out.println("order2 �����ļ۸��Ƕ��٣�" + order2.cost());
		System.out.println("order2 �������꾡��Ϣ�� " + order2.getDescription());
	}

}
