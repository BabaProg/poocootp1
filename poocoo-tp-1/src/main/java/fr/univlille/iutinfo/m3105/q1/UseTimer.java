package fr.univlille.iutinfo.m3105.q1;

public class UseTimer {

	public static void main(String[] args) {
		Chronometre ch = new Chronometre();

		Timer t = new Timer();

		t.attach(ch);
		t.start();
	}

}
