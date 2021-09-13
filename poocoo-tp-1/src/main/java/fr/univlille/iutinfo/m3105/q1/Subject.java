package fr.univlille.iutinfo.m3105.q1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	List<Observer> observers;
	
	public Subject() {
		 observers = new ArrayList<Observer>();
	}

	protected void notifyObservers() {
		for (Observer obs : observers) {
			obs.update(this);
		}
	}

	protected void notifyObservers(Object data) {
		for (Observer obs : observers) {
			obs.update(this, data);
		}
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}
}
