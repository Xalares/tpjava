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
		return this.jour;
	}

	public int getMois() {
		return this.mois;
	}

	public int getAn() {
		return this.an;
	}

	public int getHeure() {
		return this.heure;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSeconde() {
		return this.seconde;
	}
	
	/**@overrides*/
	public String toString() {
		return(this.heure+":"+this.minute+":"+this.seconde+" "+this.jour+"/"+this.mois+"/"+this.an);
	}
}
