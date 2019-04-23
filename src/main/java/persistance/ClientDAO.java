package persistance;

import java.util.List;

import model.Client;

/**
 * Interface ClientDAO qui r�f�rence les op�rations CRUD (Create, Read, Update
 * and Delete) du client dans la base de donn�es clients.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public interface ClientDAO {

	/**
	 * M�thode permettant de sauvegarder un client c dans la base de donn�es
	 * clients.
	 * 
	 * @param Client c
	 */
	public void sauvegarderClient(Client c);

	/**
	 * M�thode permettant d'obtenir un client dans la base de donn�es clients �
	 * partir de son id.
	 * 
	 * @param int id
	 */
	public Client afficherClientParId(int id);

	/**
	 * M�thode permettant d'obtenir la liste de tous les clients de la base de
	 * donn�es clients.
	 * 
	 */
	public List<Client> afficherTout();

	/**
	 * M�thode permettant de modifier l'adresse d'un client dans la base de donn�es
	 * clients � partir de son id.
	 * 
	 * @param int id, String adresse
	 */
	public void modifierAdresseClientParId(int id, String adresse);

	/**
	 * M�thode permettant de modifier le code postal d'un client dans la base de
	 * donn�es clients � partir de son id.
	 * 
	 * @param int id, int codePostal
	 */
	public void modifierCodePostalClientParId(int id, int codePostal);

	/**
	 * M�thode permettant de modifier la ville d'un client dans la base de donn�es
	 * clients � partir de son id.
	 * 
	 * @param int id, String ville
	 */
	public void modifierVilleClientParId(int id, String ville);

	/**
	 * M�thode permettant de modifier le t�l�phone d'un client dans la base de
	 * donn�es clients � partir de son id.
	 * 
	 * @param int id, String telephone
	 */
	public void modifierTelephoneClientParId(int id, String telephone);

	/**
	 * M�thode permettant de supprimer un client de la base de donn�es clients �
	 * partir de son id.
	 * 
	 * @param int id
	 */
	public void supprimerClientParId(int id);

}
