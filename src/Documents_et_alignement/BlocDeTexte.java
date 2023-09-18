package Documents_et_alignement;

import java.io.PrintStream;

/**
 * Bloc de texte constitué d'une nombre quelconque de paragraphes.
 * @author Guillaume Huard
 */
public class BlocDeTexte {
	private final int nbMaxPar = 100;
	private Paragraphe[] paragraphes;
	private int nbPar;

	/**
	 * Construit un bloc de texte vide.
	 */
	public BlocDeTexte() {
		paragraphes = new Paragraphe[nbMaxPar];
		nbPar = 0;
	}

	/**
	 * Ajoute un paragraphe au bloc de texte.
	 * @param p Paragraphe à ajouter
	 */
	public void ajoute(Paragraphe p) {
		paragraphes[nbPar] = p;
		nbPar++;
	}

	/**
	 * Fixe la largeur de tous les paragraphes du bloc de texte.
	 * @param f Nouvelle largeur
	 */
	public void fixeLargeur(int f) {
		for (int i = 0; i < nbPar; i++) {
			paragraphes[i].fixeLargeur(f);
		}
	}

	/**
	 * Ecris la représentation textuelle du bloc de texte sur le flux de sortie donné.
	 * @param p Flux de sortie
	 */
	public void ecris(PrintStream p) {
		for (int i = 0; i < nbPar; i++) {
			p.println(paragraphes[i]);
		}
	}

	/**
	 * Renvoie des infos textuelles sur la nature du texte (Bloc de texte)
	 * et son nombre de paragraphe.
	 * @return Descriptif du texte
	 */
	@Override
	public String toString() {
		return "Bloc de texte avec " + nbPar + " paragraphes.";
	}
}
