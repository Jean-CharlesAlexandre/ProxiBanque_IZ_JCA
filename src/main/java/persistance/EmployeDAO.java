package persistance;

import java.util.List;

import model.Employe;

/**
 * Interface EmployeDAO qui r�f�rence les op�rations CRUD (Create, Read, Update
 * and Delete) de l'employ� dans la base de donn�es des employ�s.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public interface EmployeDAO {

	/**
	 * M�thode permettant de sauvegarder un employe e dans la base de donn�es
	 * employ�s.
	 * 
	 * @param Employe e
	 */
	public void sauvegarderEmploye(Employe e);

	/**
	 * M�thode permettant d'obtenir un employe dans la base de donn�es employ�s �
	 * partir de son id.
	 * 
	 * @param int id
	 */
	public Employe afficherEmployeParId(int id);

	/**
	 * M�thode permettant d'obtenir tous les employ�s de la base de donn�es
	 * employ�s.
	 *
	 */
	public List<Employe> afficherTout();

	/**
	 * M�thode permettant de supprimer un employe de la base de donn�es employ�s.
	 * 
	 * @param int id
	 */
	public void supprimerEmploye(int id);

}
