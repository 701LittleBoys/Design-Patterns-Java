package com.imufe.edu.subjectmodel;

import java.util.ArrayList;

import com.imufe.edu.observer.Observer;
import com.imufe.edu.subject.Subject;

public class WeatherDataSt implements Subject {
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	//保存介入的不同的第三方的公司
	private ArrayList<Observer> titleobserverlist = new ArrayList<Observer> ();
	
	public WeatherDataSt() {
		// TODO Auto-generated constructor stub
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}
	
	public void dataChange (){
		//数据更新的实质就是对第三方的通知，数据传输的时候我们尽量单纯的做一种动作：通知
		notifyObserver();
	}
	
	public void setData (float temperatrue,float pressure,float humidity){
		this.temperature = temperatrue;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		this.titleobserverlist.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if (this.titleobserverlist.contains(o)){
			this.titleobserverlist.remove(o);
		}
	}

	//更新第三方公司中的列表数据
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer ll : this.titleobserverlist){
			ll.update(this.getTemperature(), this.getPressure(), this.getHumidity());
		}
	}

}
