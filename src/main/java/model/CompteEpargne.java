package model;

/**
 * Classe CompteEpargne caract�ris�e par un taux de r�mun�ration qui h�rite de
 * la classe Compte.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class CompteEpargne extends Compte {

//	Attribut
	private int TAUXREMUNERATION = 3;

//	Constructeur
	public CompteEpargne(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}

//	Getter et setter
	public int getTAUXREMUNERATION() {
		return TAUXREMUNERATION;
	}

	public void setTAUXREMUNERATION(int tAUXREMUNERATION) {
		TAUXREMUNERATION = tAUXREMUNERATION;
	}

	@Override
	public String toString() {
		return "num�ro de compte : " + getNumeroCompte() + ", �pargne : " + getSolde() + "�" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
