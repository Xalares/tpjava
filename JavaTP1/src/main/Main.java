/**
 * 
 */
package main;
/**
 * @author Alexis
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Banque creditAgricole = new Banque();
		Banque caisseDepargne = new Banque();
		Date dateNaissanceA = new Date(2,10,1995);
		Date dateNaissanceB = new Date(12,5,1995);
		
		Compte compteA=new Compte();
		Compte compteB=new Compte();
		
		compteA.depot(1200);
		compteB.depot(4500);
		
		Client Alexis=new Client("Alexis",dateNaissanceA,compteA,1);
		Client Bruno=new Client("Bruno",dateNaissanceB,compteB,1);
		
		Alexis.afficherSolde();
		Bruno.afficherSolde();
		
		creditAgricole.ajouterClient();
		
		
		// TODO Auto-generated method stub
		System.out.println(new Date(14,02,2007).toString()); 
	}

}
