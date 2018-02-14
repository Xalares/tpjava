/**
 * 
 */
package main;

/**
 * @author Alexis
 *
 */
public class Date {
	private int jour, mois, an, heure, minute, seconde;

	public Date(int jour,int moi,int an) {
		this.jour = jour;
		this.mois = moi;
		this.an = an;
		this.heure = 0;
		this.minute = 0;
		this.seconde = 0;
	}

	/**Methode getJour*/
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getAn() {
		return an;
	}

	public int getHeure() {
		return heure;
	}

	public int getMinute() {
		return minute;
	}

	public int getSeconde() {
		return seconde;
	}
	
	/**@overrides*/
	public String toString() {
		return(heure+":"+minute+":"+seconde+" "+jour+"/"+mois+"/"+an);
	}
}
