package Documents_et_alignement;

/**
 * Texte centré, typiquement un titre, mais peut s'appliquer à tout texte centré.
 * Le centrage est réalisé en ajoutant suffisamment d'espaces à gauche du texte.
 * 
 * @author Guillaume Huard
 */
public class TexteCentre {
	private String texte;
	private int largeur;

	/**
	 * Construit un texte centré de largeur 80 à partir d'une chaîne de caractères.
	 * @param t La chaîne de caractères à centrer
	 */
	public TexteCentre(String t) {
		texte = t;
		largeur = 80;
	}

	/**
	 * Change la largeur du texte centré.
	 * @param l Nouvelle largeur
	 */
	public void fixeLargeur(int l) {
		largeur = l;
	}
	
	/**
	 * Renvoie la chaîne de caractères de ce texte non centrée.
	 * @return Texte non centré
	 */
	public String texte() {
		return texte;
	}

	/**
	 * Renvoie le texte centré : une chaîne de caractères avec suffisamment d'espaces
	 * à gauche pour que le texte soit centré par rapport à sa largeur
	 * @returns Le texte centré
	 */
	@Override
	public String toString() {
		int justification;
		StringBuilder resultat = new StringBuilder();

		justification = (largeur - texte.length()) / 2;
		for (int i = 0; i < justification; i++) {
			resultat.append(' ');
		}
		resultat.append(texte);
		return resultat.toString();
	}
}
