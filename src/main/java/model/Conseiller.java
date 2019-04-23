package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Conseiller caract�ris�e par une liste de clients et qui h�rite de la
 * classe Employe.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class Conseiller extends Employe {

//	Attribut
	private List<Client> listeClient = new ArrayList<Client>();

//	Constructeur
	public Conseiller(String nom, String prenom) {
		super(nom, prenom);
	}

//	Getter et setter
	public List<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}

	@Override
	public String toString() {
		return "Conseiller [listeClient=" + listeClient + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ "]";
	}

}
