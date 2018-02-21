package main;

public class Client {

	private String nom;
	private Date dateNaissance;
	private Compte compteClient;
	private int nbCompte;
	private Compte [] comptes=new Compte[100];
	
	public Client(String nom, Date date, Compte premCompte, int nbCompte) {

		this.nom = nom;
		this.dateNaissance = date;
		this.compteClient = premCompte;
		if (nbCompte <= 100 & nbCompte > 0) {
			this.nbCompte = nbCompte;
			
			for(int i=0;i<nbCompte;i++) {
				this.comptes[i]=new Compte();
				this.comptes[i].depot(0);
			}
			
		} else {
			System.out.println("Nombre de compte invalide");
		}

	}
	
	public String getNom() {
		return (nom);
	}

	public Date getDate() {
		return (dateNaissance);
	}

	public Compte getCompte(int numero) {
		if (numero <= nbCompte & numero > 0) {
			return (comptes[numero - 1]);
		} else {
			System.out.println("Numero de compte invalide");
			return (null);
		}

	}

	public void afficherBilan() {
		for (int i = 0; i <nbCompte; i++) {
			System.out.println("Solde du compte" + i + " = " + comptes[i].getSolde());
		}
	}

	public float soldeTotal() {
		float total=0;
		for (int i = 0; i < this.nbCompte; i++) {
			total+=comptes[i].getSolde();
		}
		return total;
	}
	
	/**Affiche le solde total**/
	public void afficherSolde() {
		System.out.println(soldeTotal());
	}
	
	public void ajouterCompte() {
		if(nbCompte+1<100) {
			nbCompte++;
			comptes[nbCompte]=new Compte();
			comptes[nbCompte].depot(0);
		}else {
			System.out.println("nombre de comptes dépassé !");
		}
		
	}
}
