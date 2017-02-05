package com.imufe.edu.observermodel;

import com.imufe.edu.observer.Observer;

public class CurrentConditions implements Observer {
	
	private float curr_temperature;
	private float curr_pressure;
	private float curr_humidity;

	@Override
	public void update(float temperature, float pressure, float humidity) {
		// TODO Auto-generated method stub
		this.curr_temperature = temperature;
		this.curr_pressure = pressure;
		this.curr_humidity = humidity;
	}
	
	
	public void display (){
		System.out.println("今天的温度  : " + this.curr_temperature);
		System.out.println("今天的气压  : " + this.curr_pressure);
		System.out.println("今天的海拔  : " + this.curr_humidity);
	}

}
