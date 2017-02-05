package com.imufe.edu.observermodel;

import java.util.Observable;

import com.imufe.edu.mypacket.WeatherDataPacket;
/*
 * 由于java内置对象的observable已经内置了三个主要方法：注册，移除，通知
 * 所以主要的方法不用我们去做
 */

public class WeatherData extends Observable {
	
	private float tempreature;
	private float pressure;
	private float humidity;
	public float getTempreature() {
		return tempreature;
	}
	public void setTempreature(float tempreature) {
		this.tempreature = tempreature;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	public void dataChange (){
		this.setChanged();//注意：这是java内置对象的方法，这个方法主要依靠boolean变量进行判断是不是数据进行了更新
		//true就进行通知，false就不进行通知
		this.notifyObservers(new WeatherDataPacket(this.getTempreature(),this.getPressure(),this.getHumidity()));
	}
	
	public void setData (float tempreature,float pressure,float humidity){
		this.setTempreature(tempreature);
		this.setPressure(pressure);
		this.setHumidity(humidity);
		this.dataChange();
	}

}
