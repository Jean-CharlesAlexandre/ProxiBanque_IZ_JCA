package model;

import model.entity.Employe;

/**
 * Classe Gerant et qui h�rite de la classe Employe.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class Gerant extends Employe {

//	Constructeur
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
	}

}
