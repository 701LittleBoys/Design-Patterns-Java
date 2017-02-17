package com.imufe.edu.FactoryBasic;



public abstract class FactoryOrigin {
	
	private String factory_name;

	public String getFactory_name() {
		return factory_name;
	}

	public void setFactory_name(String factory_name) {
		this.factory_name = factory_name;
	}
	public abstract void setFactory_name ();
}
