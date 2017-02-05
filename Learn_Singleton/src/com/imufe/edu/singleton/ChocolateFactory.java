package com.imufe.edu.singleton;

public class ChocolateFactory {
	private boolean pan_empty;
	private boolean pan_boiled;
	
	//�����С�������
	//private static ChocolateFactory uniqueInstance = new ChocolateFactory();
	private volatile static ChocolateFactory uniqueInstance = null;
	
	private ChocolateFactory (){
		this.pan_boiled = false;
		this.pan_empty = true;
	}
	
	//���Ҫ��ֹ���߳����ж����µĲ�Ψһ�Ե����⣬��򵥵ķ�ʽ���Ǽ���ͬ����
	/*
	 * �������ַ�����ȱ��Ҳ�����ԣ�����ͬ������Ҫ���ĵ���Դ�ܶ࣬�����¶��û�״̬��
	 * ���û����鼫��
	 */
	/*
	public static synchronized ChocolateFactory getInstance (){
		if (uniqueInstance == null){
			uniqueInstance = new ChocolateFactory();
		}
		return uniqueInstance;
	}
	*/
	
	public static synchronized ChocolateFactory getInstance (){
		if (uniqueInstance == null){
			synchronized (ChocolateFactory.class)
			{
				if (uniqueInstance == null){
					uniqueInstance = new ChocolateFactory();
				}
			}
		}
		return uniqueInstance;
	}
	
	//�˺��������ԭ��
	public void add_fill (){
		if (this.pan_empty){
			this.pan_empty = false;
			this.pan_boiled = false;
		}
	}
	
	//�˺����ǶԹ����м���
	public void pan_boil (){
		if (this.pan_empty != true && this.pan_boiled != true){
			this.pan_boiled = true;
		}
	}
	
	//�˺����ǶԹ��е��ɿ��������ų�
	public void pan_drain (){
		if (this.pan_empty != true && this.pan_boiled == true){
			this.pan_empty = true;
		}
	}

}
