package fr.univlille.iutinfo.m3105.q1;

public class Timer extends Subject {

	TimerThread timer = new TimerThread(this);

	public void start() {
		timer.start();
	}

	public void stopRunning() {
		timer.interrupt();
	}

}
