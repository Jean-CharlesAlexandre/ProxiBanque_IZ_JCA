package model;

/**
 * Classe CompteCourant caract�ris�e par une autorisation de d�couvert et qui
 * h�rite de la classe Compte.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class CompteCourant extends Compte {

//	Attribut
	private int AUTORISATIONDECOUVERT = 1000;

//	Constructeur
	public CompteCourant(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}

//	Getter et setter
	public int getAUTORISATIONDECOUVERT() {
		return AUTORISATIONDECOUVERT;
	}

	public void setAUTORISATIONDECOUVERT(int aUTORISATIONDECOUVERT) {
		AUTORISATIONDECOUVERT = aUTORISATIONDECOUVERT;
	}

	@Override
	public String toString() {
		return "num�ro de compte : " + getNumeroCompte() + ", solde : " + getSolde() + "�" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
