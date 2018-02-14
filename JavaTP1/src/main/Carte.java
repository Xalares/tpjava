package main;

public class Carte {
	private int code[]=new int[4];
	private Banque banqueAsso;
	private int numClient;
	private int numCompte;
	private Date dateValidite;
	private int compteur=3;
	
	boolean codeValide(int[] codeVer) {
		if(codeVer==code) {
			return true;
		}else {
			return false;
		}
	}
	void payer(Banque b, int numClient,int numCompte, float montant) {
		banqueAsso.retrait();
	}
}
