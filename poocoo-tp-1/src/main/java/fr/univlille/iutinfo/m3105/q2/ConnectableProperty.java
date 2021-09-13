package fr.univlille.iutinfo.m3105.q2;

import fr.univlille.iutinfo.m3105.q1.Observer;
import fr.univlille.iutinfo.m3105.q1.Subject;

public class ConnectableProperty extends ObservableProperty implements Observer {

	public void connectTo(ConnectableProperty p2) {
		p2.attach(this);
		setValue(p2.getValue()); // On met la nouvelle valeur à celle de p2
		// Soit on met this à p2
	}

	public void biconnectTo(ConnectableProperty p2) {
		// Permet d'avoir la même valeur pour this et p2
		this.connectTo(p2);
		p2.connectTo(this);
	}

	public void unconnectFrom(ConnectableProperty p2) {
		p2.detach(this);
	}

	@Override
	public void update(Subject subj) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void update(Subject subj, Object data) {
		setValue(data);
	}

}
