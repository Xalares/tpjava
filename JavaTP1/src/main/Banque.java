package main;

public class Banque {
	private int nbClient=0;
	private Client [] clients= new Client[100];
	
	public void ajouterClient() {
		if(nbClient-1<100) {
			nbClient++;
			clients[nbClient].ajouterCompte();
		}
	}
	
	public void afficherBilan() {
		for(int i=0;i<nbClient;i++) {
			clients[i].afficherBilan();
		}
	}
}
