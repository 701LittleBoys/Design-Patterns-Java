package com.imufe.edu.observermodel;

import java.util.Observable;

import com.imufe.edu.mypacket.WeatherDataPacket;
/*
 * ����java���ö����observable�Ѿ�������������Ҫ������ע�ᣬ�Ƴ���֪ͨ
 * ������Ҫ�ķ�����������ȥ��
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
		this.setChanged();//ע�⣺����java���ö���ķ��������������Ҫ����boolean���������ж��ǲ������ݽ����˸���
		//true�ͽ���֪ͨ��false�Ͳ�����֪ͨ
		this.notifyObservers(new WeatherDataPacket(this.getTempreature(),this.getPressure(),this.getHumidity()));
	}
	
	public void setData (float tempreature,float pressure,float humidity){
		this.setTempreature(tempreature);
		this.setPressure(pressure);
		this.setHumidity(humidity);
		this.dataChange();
	}

}
