package fr.univlille.iutinfo.m3105.q1;

public interface Observer {
	
	public void update(Subject subj);

	public void update(Subject subj, Object data);

}
