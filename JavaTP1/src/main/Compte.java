package main;

public class Compte {
	private float solde=0;
	
	void depot(float valeur){
		this.solde+=valeur;
	}
	void retrait(float valeur) {
		this.solde-=valeur;
	}
	float getSolde() {
		return solde;
	}
	void afficherSolde() {
		System.out.println(solde);
	}
	void virer(float valeur, Compte destinataire) {
		destinataire.solde+=valeur;
		solde-=valeur;
	}
}
