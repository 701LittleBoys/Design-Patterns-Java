package com.imufe.edu.subjectmodel;

import java.util.ArrayList;

import com.imufe.edu.observer.Observer;
import com.imufe.edu.subject.Subject;

public class WeatherDataSt implements Subject {
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	//�������Ĳ�ͬ�ĵ������Ĺ�˾
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
		//���ݸ��µ�ʵ�ʾ��ǶԵ�������֪ͨ�����ݴ����ʱ�����Ǿ�����������һ�ֶ�����֪ͨ
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

	//���µ�������˾�е��б�����
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer ll : this.titleobserverlist){
			ll.update(this.getTemperature(), this.getPressure(), this.getHumidity());
		}
	}

}
