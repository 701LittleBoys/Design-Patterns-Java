package com.imufe.edu.observermodel;

import com.imufe.edu.observer.Observer;

public class ForwardConditions implements Observer {
	private float forw_temperature;
	private float forw_pressure;
	private float forw_humidity;
	
	

	public float getForw_temperature() {
		return forw_temperature;
	}



	public float getForw_pressure() {
		return forw_pressure;
	}



	public float getForw_humidity() {
		return forw_humidity;
	}



	@Override
	public void update(float temperature, float pressure, float humidity) {
		// TODO Auto-generated method stub
		this.forw_temperature = temperature;
		this.forw_pressure = pressure;
		this.forw_humidity = humidity;
	}
	
	public void display (){
		System.out.println("today tempreasure : " + this.forw_temperature);
		System.out.println("today pressure : " + this.forw_pressure);
		System.out.println("today humidity :" + this.forw_humidity);
	}

}
