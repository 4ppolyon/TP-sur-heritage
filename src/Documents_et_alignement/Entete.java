package Documents_et_alignement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Entête d'un document, constitué d'un titre, d'un auteur et d'une date, le tout centré.
 * @author Guillaume Huard
 */
public class Entete {
	private TexteCentre titre;
	private TexteCentre auteur;
	private TexteCentre date;
	
	/**
	 * Construit un entête étant donné un titre, un auteur et une date
	 * @param t Titre
	 * @param a Auteur
	 * @param d Date
	 */
	public Entete(String t, String a, Date d) {
		titre = new TexteCentre(t);
		auteur = new TexteCentre(a);
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		date = new TexteCentre(f.format(d));
	}
	
	/**
	 * Construit un entête étant donné un titre et un auteur.
	 * Prend la date du jour comme date.
	 * @param t Titre
	 * @param a Auteur
	 */
	public Entete(String t, String a) {
		this(t, a, new Date());
	}
	
	/**
	 * Fixe la largeur de toutes les parties de l'entête (titre, auteur et date).
	 * @param f Nouvelle largeur
	 */
	public void fixeLargeur(int f) {
		titre.fixeLargeur(f);
		auteur.fixeLargeur(f);
		date.fixeLargeur(f);
	}
	
	/**
	 * Renvoie le titre de l'entête
	 * @return Titre
	 */
	public String titre() {
		return titre.texte();
	}
	
	/**
	 * Renvoie l'auteur de l'entête
	 * @return Auteur
	 */
	public String auteur() {
		return auteur.texte();
	}
	
	/**
	 * Renvoie le texte de l'entête avec chaque information (titre, auteur, date)
	 * centrée sur une ligne.
	 * @return Texte de l'entête
	 */
	@Override
	public String toString() {
		return titre + "\n" + auteur + "\n" + date;
	}
}
