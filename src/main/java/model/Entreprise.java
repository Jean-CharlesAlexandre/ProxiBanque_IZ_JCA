package model;

/**
 * Classe Entreprise caract�ris�e par num�ro SIRET et qui h�rite de la classe
 * Client.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class Entreprise extends Client {

//	Attribut
	private long numeroSIRET;

//	Constructeur
	public Entreprise(String nom, long numeroSIRET, String adresse, int codePostal, String ville, String telephone) {
		super(nom, adresse, codePostal, ville, telephone);
		this.numeroSIRET = numeroSIRET;
	}

//	Getter et setter
	public long getNumeroSIRET() {
		return numeroSIRET;
	}

	public void setNumeroSIRET(long numeroSIRET) {
		this.numeroSIRET = numeroSIRET;
	}

	@Override
	public String toString() {
		return "Entreprise : " + getNom() + "\n" + "n�SIRET : " + getNumeroSIRET() + "\n" + "Adresse :" + getAdresse()
				+ ", " + getCodePostal() + ", " + getVille() + "\n" + "T�l�phone : " + getTelephone() + "\n"
				+ "Informations compte courant : " + getCompteCourant() + "\n" + "Carte bancaire : "
				+ getCarteBancaire() + "\n" + "Informations compte �pargne : " + getCompteEpargne() + "\n";
	}

}
