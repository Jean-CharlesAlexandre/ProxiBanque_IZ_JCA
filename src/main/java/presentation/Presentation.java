package presentation;

import java.util.ArrayList;
import java.util.List;

import model.Agence;
import model.CB;
import model.CompteCourant;
import model.CompteEpargne;
import model.Conseiller;
import model.Entreprise;
import model.Gerant;
import model.Particulier;
import service.ClientService;
import service.ServiceImplementationClient;
import service.ServiceImplementationEmploye;

/**
 * La classe Presentation poss�de la m�thode main, le point d'entr�e de
 * l'application. Cette classe pr�sente un sc�nario retra�ant "la vie de tous
 * les jours" d'un conseiller utilisant notre application.
 * 
 * @author Jean-Charles & J�r�mi
 *
 */
public class Presentation {

	public static void main(String[] args) {

		ClientService clientservice = new ServiceImplementationClient();
		ServiceImplementationEmploye employeservice = new ServiceImplementationEmploye();

		// Etat initial de la banque

		// Cr�ation de l'agence

		Agence A = new Agence("5E62v", "8 juillet 2010");

		// Cr�ation d'un g�rant

		Gerant G = new Gerant("PASQUIER", "Yves");

		// Cr�ation de liste de 2 conseillers

		Conseiller cons1 = new Conseiller("MARTIN", "Pierre");
		Conseiller cons2 = new Conseiller("BERNARD", "Georges");
		List<Conseiller> listeConseiller = new ArrayList<>();
		listeConseiller.add(cons1);
		listeConseiller.add(cons2);

		// Cr�ation de 10 clients
		Particulier c1 = new Particulier("ALEXANDRE", "Jean-Charles", "14 rue du lapin", 90785, "Vilf�lon",
				"03.25.48.65.74");
		Particulier c2 = new Particulier("L'HERMITE", "Thierry", "5 all�e de la for�t", 41254, "Pirouette",
				"02.12.32.54.69");
		Particulier c3 = new Particulier("DUJARDIN", "Jean", "27 boulevard des morilles", 74250, "Ville-Combe",
				"04.52.58.69.65");
		Particulier c4 = new Particulier("POIVRE D'ARVOR", "Patrick", "7 chemin du bosquet", 11358, "Minnestron",
				"05.21.24.25.36");
		Entreprise c5 = new Entreprise("GT'M Ing�nierie", 54896574123548L, "1 place de la bourse", 25477,
				"Noro�t sur Yvette", "01.69.54.53.52");
		Entreprise c6 = new Entreprise("Capgemini", 15478659325410L, "2 boulevard de Mercure", 78541, "Suresnes",
				"02.32.54.15.56");
		Entreprise c7 = new Entreprise("Safran", 47856932104587L, "17 bis voie de la r�volution", 32417,
				"Pero�t en l'Hay", "03.57.89.64.21");
		Particulier c8 = new Particulier("PIRAT", "J�r�mi", "85 all�e du conqu�rant", 45611, "Tirlareine",
				"01.25.54.56.69");
		Particulier c9 = new Particulier("CREA'C", "Yann", "5 route du (meilleur des) formateur(s)", 75014, "Paris",
				"01.75.54.21.23");
		Particulier c10 = new Particulier("DRUCKER", "Michel", "13 boulevard de la vieillerie", 56471,
				"Berger-sur-Loire", "02.12.54.58.36");

		// Cr�ation de 10 comptes courant
		CompteCourant compteCc1 = new CompteCourant(1587.65, "25 octobre 2014");
		CompteCourant compteCc2 = new CompteCourant(2000.01, "13 mars 2015");
		CompteCourant compteCc3 = new CompteCourant(5432.58, "8 f�vrier 2011");
		CompteCourant compteCc4 = new CompteCourant(-6727.74, "31 d�cembre 2016");
		CompteCourant compteCc5 = new CompteCourant(15874.54, "16 juin 2018");
		CompteCourant compteCc6 = new CompteCourant(54236.12, "23 juillet 2012");
		CompteCourant compteCc7 = new CompteCourant(542132.65, "4 mai 2013");
		CompteCourant compteCc8 = new CompteCourant(10.24, "15 avril 2015");
		CompteCourant compteCc9 = new CompteCourant(99999999.99, "14 septembre 2010");
		CompteCourant compteCc10 = new CompteCourant(8756.37, "20 novembre 2017");

		// Association des comptes courant aux clients
		c1.setCompteCourant(compteCc1);
		c2.setCompteCourant(compteCc2);
		c3.setCompteCourant(compteCc3);
		c4.setCompteCourant(compteCc4);
		c5.setCompteCourant(compteCc5);
		c6.setCompteCourant(compteCc6);
		c7.setCompteCourant(compteCc7);
		c8.setCompteCourant(compteCc8);
		c9.setCompteCourant(compteCc9);
		c10.setCompteCourant(compteCc10);
		clientservice.ajouterCompteCourant(compteCc1, c1);
		clientservice.ajouterCompteCourant(compteCc2, c2);
		clientservice.ajouterCompteCourant(compteCc3, c3);
		clientservice.ajouterCompteCourant(compteCc4, c4);
		clientservice.ajouterCompteCourant(compteCc5, c5);
		clientservice.ajouterCompteCourant(compteCc6, c6);
		clientservice.ajouterCompteCourant(compteCc7, c7);
		clientservice.ajouterCompteCourant(compteCc8, c8);
		clientservice.ajouterCompteCourant(compteCc9, c9);
		clientservice.ajouterCompteCourant(compteCc10, c10);

		// Cr�ation des cartes bancaires
		CB carte1 = new CB("Electron");
		CB carte2 = new CB("Premier");
		CB carte3 = new CB("Electron");
		CB carte4 = new CB("Premier");
		CB carte8 = new CB("Electron");
		CB carte9 = new CB("Premier");
		CB carte10 = new CB("Electron");

		// Association des cartes bancaires aux clients
		c1.setCarteBancaire(carte1);
		c2.setCarteBancaire(carte2);
		c3.setCarteBancaire(carte3);
		c4.setCarteBancaire(carte4);
		c8.setCarteBancaire(carte8);
		c9.setCarteBancaire(carte9);
		c10.setCarteBancaire(carte10);
		clientservice.ajouterCarteBancaire(carte1, c1);
		clientservice.ajouterCarteBancaire(carte2, c2);
		clientservice.ajouterCarteBancaire(carte3, c3);
		clientservice.ajouterCarteBancaire(carte4, c4);
		clientservice.ajouterCarteBancaire(carte8, c8);
		clientservice.ajouterCarteBancaire(carte9, c9);
		clientservice.ajouterCarteBancaire(carte10, c10);

		// Cr�ations des comptes �pargne
		CompteEpargne compteEc1 = new CompteEpargne(158.65, "3 mars 2015");
		CompteEpargne compteEc2 = new CompteEpargne(20000.01, "5 octobre 2014");
		CompteEpargne compteEc3 = new CompteEpargne(532.58, "6 juin 2158");
		CompteEpargne compteEc4 = new CompteEpargne(310.14, "18 f�vrier 2011");
		CompteEpargne compteEc5 = new CompteEpargne(174.54, "1 d�cembre 2016");
		CompteEpargne compteEc9 = new CompteEpargne(9999999.99, "28 f�vrier 2017");
		CompteEpargne compteEc10 = new CompteEpargne(1432.20, "28 f�vrier 2017");

		// Association des comptes �pargne aux clients
		c1.setCompteEpargne(compteEc1);
		c2.setCompteEpargne(compteEc2);
		c3.setCompteEpargne(compteEc3);
		c4.setCompteEpargne(compteEc4);
		c5.setCompteEpargne(compteEc5);
		c9.setCompteEpargne(compteEc9);
		c10.setCompteEpargne(compteEc10);
		clientservice.ajouterCompteEpargne(compteEc1, c1);
		clientservice.ajouterCompteEpargne(compteEc2, c2);
		clientservice.ajouterCompteEpargne(compteEc3, c3);
		clientservice.ajouterCompteEpargne(compteEc4, c4);
		clientservice.ajouterCompteEpargne(compteEc5, c5);
		clientservice.ajouterCompteEpargne(compteEc9, c9);
		clientservice.ajouterCompteEpargne(compteEc10, c10);

		// Association des clients aux conseiller
		employeservice.associerClientAConseiller(c1, cons1);
		employeservice.associerClientAConseiller(c2, cons1);
		employeservice.associerClientAConseiller(c3, cons1);
		employeservice.associerClientAConseiller(c4, cons1);
		employeservice.associerClientAConseiller(c5, cons1);
		employeservice.associerClientAConseiller(c6, cons1);
		employeservice.associerClientAConseiller(c7, cons2);
		employeservice.associerClientAConseiller(c8, cons2);
		employeservice.associerClientAConseiller(c9, cons2);
		employeservice.associerClientAConseiller(c10, cons2);

		// Impl�mentation base de donn�es des employ�s
		employeservice.ajouterEmploye(G);
		employeservice.ajouterEmploye(cons1);
		employeservice.ajouterEmploye(cons2);
		A.setListeConseiller(listeConseiller);

		// Impl�mentation base de donn�es des clients
		clientservice.ajouterClient(c1);
		clientservice.ajouterClient(c2);
		clientservice.ajouterClient(c3);
		clientservice.ajouterClient(c4);
		clientservice.ajouterClient(c5);
		clientservice.ajouterClient(c6);
		clientservice.ajouterClient(c7);
		clientservice.ajouterClient(c8);
		clientservice.ajouterClient(c9);
		clientservice.ajouterClient(c10);

		// Sc�nario

		// Un nouveau client particulier (c) arrive � l'agence et est accueilli par son
		// futur conseiller (cons2).
		Particulier c11 = new Particulier("LAGAFFE", "Vincent", "5 all�e des morutiers", 33054, "Vaire",
				"05.21.54.65.58");

		// Le client souhaite ouvrir un compte courant avec une carte bleue Electron et
		// un plafond de 2000 � ainsi qu'un compte �pargne
		CompteCourant compteCc11 = new CompteCourant(1234.10, "5 avril 2019");
		compteCc11.setAUTORISATIONDECOUVERT(2000);
		CB carte11 = new CB("Electron");
		CompteEpargne compteEc11 = new CompteEpargne(5000.00, "5 avril 2019");
		c11.setCompteCourant(compteCc11);
		c11.setCompteEpargne(compteEc11);
		c11.setCarteBancaire(carte11);
		clientservice.ajouterCompteCourant(compteCc11, c11);
		clientservice.ajouterCarteBancaire(carte11, c11);
		clientservice.ajouterCompteEpargne(compteEc11, c11);

		// Le conseiller enregistre le client dans la base de donn�es et il lui est
		// associ�.
		clientservice.ajouterClient(c11);
		employeservice.associerClientAConseiller(c11, cons2);

		// Le conseiller v�rifie que toutes les donn�es du client (c11) sont bien
		// int�gr�es dans le logiciel.
		System.out.println(clientservice.trouverClientValide(11));

		// Le conseiller souhaite d�sormais modifier l'adresse d'un client (c6) apr�s
		// son d�m�nagement.
		System.out.println("Modification de l'adresse du client " + c6.getNom());
		System.out.println("Ancienne adresse : " + c6.getAdresse() + " " + c6.getCodePostal() + " " + c6.getVille());
		clientservice.modifierAdresseClient(6, "23 avenue du g�n�ral");
		clientservice.modifierCodePostalClient(6, 92547);
		clientservice.modifierVilleClient(6, "Issy les Moulineaux");
		System.out.println("Nouvelle adresse : " + c6.getAdresse() + " " + c6.getCodePostal() + " " + c6.getVille());

		// Le client (c10) contacte son conseiller pour r�aliser un virement de son
		// compte courant � son compte �pargne.
		System.out.println(
				"\n" + "Virement r�alis� par le conseiller " + cons2.getNom() + " " + cons2.getPrenom() + " :");
		System.out.println("Ancien solde compte courant : " + c10.getCompteCourant().getSolde() + " �");
		System.out.println("Ancien solde compte �pargne : " + c10.getCompteEpargne().getSolde() + " �");
		employeservice.virementCourantAEpargne(c10, 300);

		// Le client (c1) contacte son conseiller (cons1) pour r�aliser un virement vers
		// un autre client de l'agence (c2).
		System.out.println(
				"\n" + "Virement r�alis� par le conseiller " + cons1.getNom() + " " + cons1.getPrenom() + " :");
		System.out.println("Ancien solde compte courant du client " + c1.getNom() + " " + c1.getPrenom() + " : "
				+ c1.getCompteCourant().getSolde() + " �");
		System.out.println("Ancien solde compte courant du client " + c2.getNom() + " " + c2.getPrenom() + " : "
				+ c2.getCompteCourant().getSolde() + " �");
		employeservice.virementClientAClient(c1, c2, 500);

		// Un client (c3) souhaite cl�turer ses comptes et changer de banque. Son
		// conseiller (cons1) proc�de donc � la suppression du client de la base de
		// donn�es
		System.out
				.println("\n" + "Suppression des informations du client " + c3.getNom() + " " + c3.getPrenom() + " :");
		clientservice.supprimerClient(3);

		// Un audit est r�alis� sur l'agence pour v�rifier si les comptes des clients
		// sont en r�gle (comptes particulier > -5000 � et comptes entreprise > -50000
		// �)

		System.out.println("");
		System.out.println("R�sultat de l'audit de l'agence " + A.getId() + " :");
		employeservice.audit(A);

	}

}
