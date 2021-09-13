package fr.univlille.iutinfo.m3105.q2;

import fr.univlille.iutinfo.m3105.q1.Subject;

public class ObservableProperty extends Subject {

	protected Object value;

	public void setValue(Object i) {
		// On évite les boucles infini !
		if (value == i)
			return;
		if (!(value == null && i != null) && value.equals(i)) {
			return;
		}

		value = i;
		notifyObservers(i);
	}

	public Object getValue() {
		return value;
	}

}
