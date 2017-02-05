package com.imufe.edu.subject;

import com.imufe.edu.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver (Observer o);
	public void notifyObserver ();
}
