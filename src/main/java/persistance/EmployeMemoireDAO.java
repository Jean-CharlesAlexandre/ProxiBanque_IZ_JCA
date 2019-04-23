package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Employe;

/**
 * Classe EmployeMemoireDAO qui impl�mente l'interface EmployeDAO. Cette classe
 * permet de sauvegarder, modifier, lire, supprimer les informations des
 * employ�s dans la base de donn�es employ�s. Notre base de donn�es employ�s est
 * assimil�e � une HashMap.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class EmployeMemoireDAO implements EmployeDAO {

	private static final Map<Integer, Employe> DBEmploye = new HashMap<>();
	private static Integer idEmploye = 0;

	/**
	 * M�thode permettant de sauvegarder un employe e dans la base de donn�es
	 * employ�s. Un id employe est g�n�r� et incr�ment� � chaque ajout et repr�sente
	 * la cl� de cet employ� dans la HashMap.
	 * 
	 * @param Employe e
	 */
	@Override
	public void sauvegarderEmploye(Employe e) {
		e.setId(idEmploye);
		DBEmploye.put(idEmploye, e);
		idEmploye++;
	}

	/**
	 * M�thode retournant un employe de la base de donn�es clients � partir de son
	 * id.
	 * 
	 * @param int id
	 */
	@Override
	public Employe afficherEmployeParId(int id) {
		return DBEmploye.get(id);
	}

	/**
	 * M�thode retournant la liste de tous les clients dans la base de donn�es
	 * clients.
	 * 
	 */
	@Override
	public List<Employe> afficherTout() {
		return new ArrayList<>(DBEmploye.values());
	}

	/**
	 * M�thode permettant de supprimer un employe dans la base de donn�es employ�s �
	 * partir de son id.
	 * 
	 * @param int id
	 */
	@Override
	public void supprimerEmploye(int id) {
		DBEmploye.remove(id);
	}

}
