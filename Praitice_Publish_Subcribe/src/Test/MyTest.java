package Test;

import com.imufe.edu.observermodel.WeatherData;
import com.imufe.edu.subjectmodel.CurrentConditions;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData myweatherdata = new WeatherData();
		CurrentConditions first_company = new CurrentConditions();
		
		myweatherdata.addObserver(first_company);
		myweatherdata.setData(20, 0, 5800);
		
		first_company.display();
	}

}
