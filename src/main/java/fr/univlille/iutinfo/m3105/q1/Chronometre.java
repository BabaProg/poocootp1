package fr.univlille.iutinfo.m3105.q1;

public class Chronometre implements Observer {

	protected int sec = 0;
	protected int min = 0;
	protected int heure = 0;

	Timer timer = new Timer();

	@Override
	public void update(Subject subj) {
		sec++;
		if (sec > 59) {
			min++;
			sec = 0;
		} else if (min > 59) {
			heure++;
			min = 0;
		}
		System.out.println(heure + ":" + min + ":" + sec);

	}

	@Override
	public void update(Subject subj, Object data) {
		// TODO Auto-generated method stub

	}
}
