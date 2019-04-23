package model.entity;

<<<<<<< HEAD
import javax.persistence.Entity;

=======
>>>>>>> 27a9879d9145e68682cddd3b5920b589075871c8
/**
 * Classe CompteEpargne caract�ris�e par un taux de r�mun�ration qui h�rite de
 * la classe Compte.
 * 
 * @author Jean-Charles & Ihab
 *
 */

@Entity
public class CompteEpargne extends Compte {

//	Attribut
	private int tauxRemuneration = 3;

//	Constructeur
	public CompteEpargne(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}

	public CompteEpargne() {
		super();
	}

	//	Getter et setter
	public int getTAUXREMUNERATION() {
		return tauxRemuneration;
	}

	public void setTAUXREMUNERATION(int TauxRemuneration) {
		tauxRemuneration = TauxRemuneration;
	}

	@Override
	public String toString() {
		return "num�ro de compte : " + getNumeroCompte() + ", �pargne : " + getSolde() + "�" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
