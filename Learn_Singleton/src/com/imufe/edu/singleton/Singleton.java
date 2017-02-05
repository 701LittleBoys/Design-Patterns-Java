package com.imufe.edu.singleton;

public class Singleton {
	
	private static Singleton uniqeInstance = null;
	
	private Singleton (){
		
	};
	
	public static Singleton getInstance (){
		/*
		�����жϵ�һ�ε��õĶ����ǲ��ǿգ����Ϊ�գ����ǵ�һ�δ�������Ҫ����new������
		�����Ϊ�գ������Ѿ�������ɣ�ֱ�ӷ��ض���Ϳ���
		*/
		if (uniqeInstance == null){
			uniqeInstance = new Singleton ();
		}
		return uniqeInstance;
		
	}

}
