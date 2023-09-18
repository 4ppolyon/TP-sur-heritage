package Documents_et_alignement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TestParagraphe {
	/**
	 * Test de la classe <tt>Paragraphe</tt> :
	 * <ul>
	 * <li>parcourt le fichier <tt>Candide.txt</tt> fourni et construit un paragraphe à partir de chaque bloc de texte,
	 * où les blocs de texte sont séparés par une ligne vide
	 * <li>affiche deux fois chaque paragraphe, d'abord avec la largeur par défaut, ensuite sur une largeur de 40
	 * </ul>
	 * @param args Largeur souhaitée (1er argument)
	 */
	public static void main(String[] args) {
		String nomFichier = "Candide.txt";
		try {
			InputStream in = new FileInputStream(nomFichier);
			Scanner s = new Scanner(in);
			Paragraphe p = null;
			while (s.hasNextLine()) {
				String ligne = s.nextLine().trim();
				if (ligne.length() == 0) {
					if (p != null) {
						System.out.println(p);
						p.fixeLargeur(40);
						System.out.println(p);
						p = null;
					}
				} else {
					if (p == null)
						p = new ParagrapheGauche();
					String[] mots = ligne.split("\\s\\s*");
					for (int i = 0; i < mots.length; i++)
						p.ajoute(mots[i]);
				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.err.println("Impossible de trouver " + nomFichier);
		}
	}
}
