package Documents_et_alignement;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Un document constitué d'un entête, d'un bloc de texte (prologue) et d'un nombre quelconque de chapitres.
 * @author Guillaume Huard
 */
public class Document {
	private Entete titre;
	private BlocDeTexte prologue;
	private Chapitre[] chapitres;
	private int nbChap;

	/**
	 * Construit un document à partir d'un entêtre et d'un flux d'entrée. Le flux d'entrée
	 * sera constitué d'un bloc de texte suivi d'un nombre quelconque de chapitre. Une ligne
	 * dont le premier mot est CHAPITRE démarre un nouveau chapitre dont le titre est le reste
	 * de la ligne. Les paragraphes sont séparés par une ligne vide.
	 * @param t Entête du document
	 * @param in Flux d'entrée
	 */
	public Document(Entete t, InputStream in) {
		titre = t;
		prologue = new BlocDeTexte();
		chapitres = new Chapitre[100];
		nbChap = 0;

		Scanner s = new Scanner(in);
		BlocDeTexte c = prologue;
		Paragraphe p = null;
		while (s.hasNextLine()) {
			String ligne = s.nextLine().trim();
			if (ligne.length() == 0) {
				if (p != null) {
					c.ajoute(p);
					p = null;
				}
			} else {
				String[] mots = ligne.split("\\s\\s*");
				if (mots[0].equals("CHAPITRE")) {
					chapitres[nbChap] = new Chapitre(ligne);
					c = chapitres[nbChap].bloc();
					nbChap++;
				} else {
					if (p == null)
						p = new Paragraphe();
					for (int i = 0; i < mots.length; i++)
						p.ajoute(mots[i]);
				}
			}
		}
		s.close();
	}
	
	/**
	 * Fixe la largeur de l'entête, du bloc de texte initial et de tous les chapitres
	 * du document.
	 * @param f Nouvelle largeur
	 */
	public void fixeLargeur(int f) {
		titre.fixeLargeur(f);
		prologue.fixeLargeur(f);
		for (int i = 0; i < nbChap; i++) {
			chapitres[i].fixeLargeur(f);
		}
	}

	/**
	 * Ecris la représentation textuelle du document sur le flux de sortie donné.
	 * @param p Flux de sortie
	 */
	public void ecris(PrintStream p) {
		if (titre != null) {
			p.println(titre);
			p.println();
		}
		prologue.ecris(p);
		for (int i = 0; i < nbChap; i++) {
			chapitres[i].ecris(p);
		}
	}

	/**
	 * Renvoie des infos textuelles sur la nature du texte (Document)
	 * son titre, son auteur et son nombre de chapitres.
	 * @return Descriptif du texte
	 */
	@Override
	public String toString() {
		return "Document " + titre.titre() + " (" + titre.auteur() + ") : " + nbChap + " chapitres.";
	}
}
