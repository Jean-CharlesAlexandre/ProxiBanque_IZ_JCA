package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Client;

/**
 * Classe ClientMemoireDAO qui impl�mente l'interface ClientDAO. Cette classe
 * permet de sauvegarder, modifier, lire, supprimer les informations des clients
 * dans la base de donn�es clients. Notre base de donn�es clients est assimil�e
 * � une HashMap.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class ClientMemoireDAO implements ClientDAO {

	private static final Map<Integer, Client> DBClient = new HashMap<>();
	private static Integer idClient = 1;

	// Partie client

	/**
	 * M�thode permettant de sauvegarder un client c dans la base de donn�es
	 * clients. Un id client est g�n�r� et incr�ment� � chaque ajout et repr�sente
	 * la cl� de ce client dans la HashMap.
	 * 
	 * @param Client c
	 */
	@Override
	public void sauvegarderClient(Client c) {
		c.setId(idClient);
		DBClient.put(idClient, c);
		idClient++;
	}

	/**
	 * M�thode retournant un client de la base de donn�es clients � partir de son
	 * id.
	 * 
	 * @param int id
	 */
	@Override
	public Client afficherClientParId(int id) {
		return DBClient.get(id);
	}

	/**
	 * M�thode retournant la liste de tous les clients dans la base de donn�es
	 * clients.
	 * 
	 */
	@Override
	public List<Client> afficherTout() {
		return new ArrayList<>(DBClient.values());
	}

	/**
	 * M�thode permettant de modifier l'adresse d'un client dans la base de donn�es
	 * clients � partir de son id.
	 * 
	 * @param int id, String adresse
	 */
	@Override
	public void modifierAdresseClientParId(int id, String adresse) {
		DBClient.get(id).setAdresse(adresse);
	}

	/**
	 * M�thode permettant de modifier le code postal d'un client dans la base de
	 * donn�es clients � partir de son id.
	 * 
	 * @param int id, int codePostal
	 */
	@Override
	public void modifierCodePostalClientParId(int id, int codePostal) {
		DBClient.get(id).setCodePostal(codePostal);
	}

	/**
	 * M�thode permettant de modifier la ville d'un client dans la base de donn�es
	 * clients � partir de son id.
	 * 
	 * @param int id, String ville
	 */
	@Override
	public void modifierVilleClientParId(int id, String ville) {
		DBClient.get(id).setVille(ville);
	}

	/**
	 * M�thode permettant de modifier le t�l�phone d'un client dans la base de
	 * donn�es clients � partir de son id.
	 * 
	 * @param int id, String telephone
	 */
	@Override
	public void modifierTelephoneClientParId(int id, String telephone) {
		DBClient.get(id).setTelephone(telephone);
	}

	/**
	 * M�thode permettant de supprimer un client dans la base de donn�es clients �
	 * partir de son id.
	 * 
	 * @param int id
	 */
	@Override
	public void supprimerClientParId(int id) {
		DBClient.remove(id);
	}
}
