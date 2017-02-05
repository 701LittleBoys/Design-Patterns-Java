package com.imufe.edu.subjectmodel;

import java.util.Observable;
import java.util.Observer;

import com.imufe.edu.mypacket.WeatherDataPacket;

public class CurrentConditions implements Observer  {
	private float packet_tempreture;
	private float packet_pressure;
	private float packet_humidity;
	
	public CurrentConditions() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherDataPacket jieshou = (WeatherDataPacket) arg;
		this.packet_tempreture = jieshou.getPacket_tempreture();
		this.packet_pressure = jieshou.getPacket_pressure();
		this.packet_humidity = jieshou.getPacket_humidity();
	}
	
	
	public void display (){
		System.out.println("今日气温  ： " + this.getPacket_tempreture());
		System.out.println("今日气压  ： " + this.getPacket_pressure());
		System.out.println("今日海拔  : " + this.getPacket_humidity());
	}

	public float getPacket_tempreture() {
		return packet_tempreture;
	}

	public void setPacket_tempreture(float packet_tempreture) {
		this.packet_tempreture = packet_tempreture;
	}

	public float getPacket_pressure() {
		return packet_pressure;
	}

	public void setPacket_pressure(float packet_pressure) {
		this.packet_pressure = packet_pressure;
	}

	public float getPacket_humidity() {
		return packet_humidity;
	}

	public void setPacket_humidity(float packet_humidity) {
		this.packet_humidity = packet_humidity;
	}
	
	

}
