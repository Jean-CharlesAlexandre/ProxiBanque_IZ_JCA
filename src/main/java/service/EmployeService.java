package service;

import java.util.List;

import model.Agence;
import model.Client;
import model.Employe;

/**
 * Interface EmployeService est compos�e des r�gles m�tiers pour l'employ� et
 * repr�sente l'interm�diaire entre l'utilisateur et la base de donn�es des
 * clients/employ�s. Cette interface comprend les m�thodes permettant de faire
 * des virements d'un compte courant � �pargne et inversement ainsi que les
 * virements d'un client � un autre (compte courant � compte courant). La
 * m�thode relative � l'audit d'une agence est �galement comprise dans cette
 * interface.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public interface EmployeService {

	/**
	 * M�thode appelant la sauvegarde d'un employ� dans la base de donn�es employ�s.
	 * 
	 * @param Employe e
	 */
	public void ajouterEmploye(Employe e);

	/**
	 * M�thode appelant la demande d'un employ� dans la base de donn�es employ�s.
	 * 
	 * @param int id
	 */
	public Employe trouverEmploye(int id);

	/**
	 * M�thode appelant la demande de tous les employ�s dans la base de donn�es
	 * employ�s.
	 * 
	 */
	public List<Employe> trouverToutEmploye();

	/**
	 * M�thode appelant la suppression d'un employ� dans la base de donn�es
	 * employ�s.
	 * 
	 * @param int id
	 */
	public void supprimerEmploye(int id);

	/**
	 * M�thode permettant de r�aliser le virement d'un client c d'un montant de
	 * montantVirement depuis le compte courant jusqu'au compte �pargne.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementCourantAEpargne(Client c, double montantVirement);

	/**
	 * M�thode permettant de r�aliser le virement d'un client c d'un montant de
	 * montantVirement depuis le compte �pargne jusqu'au compte courant.
	 * 
	 * @param Client c, double montantVirement
	 */
	public void virementEpargneACourant(Client c, double montantVirement);

	/**
	 * M�thode permettant de r�aliser le virement d'un compte courant d'un client c1
	 * vers le compte courant d'un client c2 d'un montant de montantVirement.
	 * 
	 * @param Client c1, Client c2, double montantVirement
	 */
	public void virementClientAClient(Client c1, Client c2, double montantVirement);

	/**
	 * M�thode permettant de r�aliser l'audit d'une agence
	 * 
	 * @param Agence agence
	 */
	public boolean audit(Agence agence);
}
