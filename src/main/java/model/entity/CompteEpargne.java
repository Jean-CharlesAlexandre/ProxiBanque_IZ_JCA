package model.entity;

<<<<<<< HEAD
import javax.persistence.Entity;

=======
>>>>>>> 27a9879d9145e68682cddd3b5920b589075871c8
/**
 * Classe CompteEpargne caractérisée par un taux de rémunération qui hérite de
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
		return "numéro de compte : " + getNumeroCompte() + ", épargne : " + getSolde() + "€" + ", date d'ouverture : "
				+ getDateOuverture();
	}

}
