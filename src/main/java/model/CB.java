package model;

/**
 * Classe CB caract�ris�e par un num�ro de carte, un plafond de retrait et du
 * type de carte.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class CB {

	// Attributs
	private long numeroCarte;
	private int PLAFONDRETRAIT = 300;
	private String typeCarte;

	// Constructeur
	public CB(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	// Getters et setters
	public long getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public int getPlafondRetrait() {
		return PLAFONDRETRAIT;
	}

	public void setPlafondRetrait(int plafondRetrait) {
		this.PLAFONDRETRAIT = plafondRetrait;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	@Override
	public String toString() {
		return "num�ro carte : " + getNumeroCarte() + ", type de carte : " + getTypeCarte() + ", plafond : "
				+ getPlafondRetrait() + "�";
	}

}
