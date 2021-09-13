package fr.univlille.iutinfo.m3105.q1;

public class TimerThread extends Thread {

	protected Timer timer;
	
	public TimerThread(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(1000);
				// Annoncer le "tick de l'horloge"
				timer.notifyObservers();

			} catch (InterruptedException e) {
				// On ignore et on esp�re que ce n'est pas grave
			}
		}
	}

}
