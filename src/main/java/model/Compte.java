package model;

/**
 * Classe Compte caract�ris�e par un num�ro de compte, un solde et une date
 * d'ouverture.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class Compte {

	// Attributs
	private long numeroCompte;
	private double solde;
	private String dateOuverture;

	// Constructeur
	public Compte(double solde, String dateOuverture) {
		setSolde(solde);
		this.dateOuverture = dateOuverture;
	}

	// Getters et setters
	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	/**
	 * Impossible d'attribuer un solde de compte dans le n�gatif
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

}
