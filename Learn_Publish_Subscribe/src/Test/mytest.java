package Test;

import com.imufe.edu.observermodel.CurrentConditions;
import com.imufe.edu.observermodel.ForwardConditions;
import com.imufe.edu.subjectmodel.WeatherDataSt;

public class mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentConditions first_curr = new CurrentConditions();
		ForwardConditions second_curr = new ForwardConditions();
		WeatherDataSt mWeatherDataSt = new WeatherDataSt ();
		
		mWeatherDataSt.registerObserver(first_curr);
		mWeatherDataSt.registerObserver(second_curr);
		mWeatherDataSt.setData(28, 4300, -2);
		
		
		System.out.println("======= 第三方公司进行数据的显示 =========");
		first_curr.display();
		System.out.println("====== 第三方公司进行数据的显示 ======");
		second_curr.display();
		
		mWeatherDataSt.removeObserver(first_curr);
		mWeatherDataSt.setData(0, 0, 0);
		first_curr.display();
		second_curr.display();
	}

}
