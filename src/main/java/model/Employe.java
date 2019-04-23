package model;

/**
 * Classe Employe caract�ris�e par un id, un nom et un pr�nom.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class Employe {

//	Attribut
	private int id;
	private String nom;
	private String prenom;

//	Constructeur
	public Employe(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

//	Getter et setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
