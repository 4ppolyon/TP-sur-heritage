package Documents_et_alignement;

import java.io.PrintStream;

/**
 * Bloc de texte doté d'un titre centré.
 * @author Guillaume Huard
 */
public class Chapitre {
	private TexteCentre titre;
	private BlocDeTexte texte;

	/**
	 * Construit un chapitre vide doté d'un titre donné.
	 * @param t Titre du chapitre
	 */
	public Chapitre(String t) {
		titre = new TexteCentre(t);
		texte = new BlocDeTexte();
	}
	
	/**
	 * Renvoie le bloc de texte du chapitre (sans titre).
	 * @return Le texte du chapitre
	 */
	public BlocDeTexte bloc() {
		return texte;
	}

	/**
	 * Ajoute un paragraphe au chapitre.
	 * @param p Paragraphe à ajouter.
	 */
	public void ajoute(Paragraphe p) {
		texte.ajoute(p);
	}

	/**
	 * Fixe la largeur de tous les paragraphes du bloc de texte ainsi
	 * que de son titre.
	 * @param f Nouvelle largeur
	 */
	public void fixeLargeur(int f) {
		titre.fixeLargeur(f);
		texte.fixeLargeur(f);
	}

	/**
	 * Ecris la représentation textuelle du chapitre sur le flux de sortie donné.
	 * @param p Flux de sortie
	 */
	public void ecris(PrintStream p) {
		p.println(titre);
		p.println();
		texte.ecris(p);
	}

	/**
	 * Renvoie des infos textuelles sur la nature du texte (Chapitre)
	 * et son nombre de paragraphe.
	 * @return Descriptif du texte
	 */
	@Override
	public String toString() {
		return "Chapitre " + titre + " : " + texte;
	}
}
