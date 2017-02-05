package com.imufe.edu.mypacket;

public class WeatherDataPacket {
	private float packet_tempreture;
	private float packet_pressure;
	private float packet_humidity;
	
	public WeatherDataPacket() {
		// TODO Auto-generated constructor stub
	}
	
	public WeatherDataPacket(float tempreture,float pressure,float humidity) {
		this.packet_tempreture = tempreture;
		this.packet_pressure = pressure;
		this.packet_humidity = humidity;
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
