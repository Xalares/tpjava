package main;

public class Client {

	private String nom;
	private Date dateNaissance;
	private Compte compteClient;
	private int nbCompte;
	private Compte comptes[];

	public Client(String nom, Date date, Compte premCompte, int nbCompte) {

		this.nom = nom;
		this.dateNaissance = date;
		this.compteClient = premCompte;
		if (nbCompte <= 100 & nbCompte > 0) {
			this.nbCompte = nbCompte;
			this.comptes = new Compte[nbCompte];
			this.comptes[0].depot(0);
		} else {
			System.out.println("Nombre de compte invalide");
		}

	}

	public String getNom() {
		return (this.nom);
	}

	public Date getDate() {
		return (this.dateNaissance);
	}

	public Compte getCompte(int numero) {
		if (numero <= this.nbCompte & numero > 0) {
			return (this.comptes[numero - 1]);
		} else {
			System.out.println("Numero de compte invalide");
			return (null);
		}

	}

	public void afficherBilan() {
		for (int i = 0; i < this.nbCompte; i++) {
			System.out.println("Solde du compte" + i + " = " + this.comptes[i].getSolde());
		}
	}

	public float soldeTotal() {
		for (int i = 0; i < this.nbCompte; i++) {

		}
	}
}
