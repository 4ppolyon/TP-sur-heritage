package Documents_et_alignement;

/**
 * Un paragraphe constitué d'une séquence de mots, pouvant être représenté
 * sur une largeur donnée avec un centrage à gauche.
 * @author Guillaume Huard
 */
public class Paragraphe {
	private final int nbMaxMots = 5000;
	private String[] mots;
	private int nbMots;
	private String[] lignes;
	private int nbLignes;
	private boolean aJour;
	private int largeur;

	/**
	 * Paragraphe vide de largeur 80.
	 */
	public Paragraphe() {
		mots = new String[nbMaxMots];
		lignes = new String[nbMaxMots];
		nbMots = 0;
		nbLignes = 0;
		aJour = false;
		largeur = 80;
	}

	/**
	 * Change la largeur du paragraphe.
	 * @param l Nouvelle largeur
	 */
	public void fixeLargeur(int l) {
		largeur = l;
		aJour = false;
	}
	
	/**
	 * Ajoute un mot au paragraphe.
	 * @param mot Mot à ajouter
	 */
	public void ajoute(String mot) {
		mots[nbMots] = mot;
		nbMots++;
		aJour = false;
	}

	/**
	 * Calcule la représentation textuelle (tableau de lignes) du paragraphe
	 * si besoin (booléen aJour).
	 */
	private void calculeLignes() {
		if (!aJour) {
			nbLignes = 0;
			// Le stringBuilder est plus efficace pour les opérations
			// sur les chaînes (concaténations, suppressions, ...)
			StringBuilder ligneCourante = new StringBuilder();
			for (int i = 0; i < nbMots; i++) {
				if (ligneCourante.length() + mots[i].length() > largeur) {
					ligneCourante.deleteCharAt(ligneCourante.length()-1);
					lignes[nbLignes] = ligneCourante.toString();
					nbLignes++;
					ligneCourante.delete(0, ligneCourante.length());
				}
				ligneCourante.append(mots[i] + ' ');
			}
			if (ligneCourante.length() > 0) {
				ligneCourante.deleteCharAt(ligneCourante.length()-1);
				lignes[nbLignes] = ligneCourante.toString();
				nbLignes++;
			}
			aJour = true;
		}
	}
	
	/**
	 * Renvoie le nombre de lignes du paragraphe (pour sa largeur courante).
	 * @return Nombre de lignes
	 */
	public int nbLignes() {
		calculeLignes();
		return nbLignes;
	}
	
	/**
	 * Renvoie une représentation textuelle du paragraphe pour sa largeur courante
	 * sous la forme d'une chaîne de caractères contenant des retours à la ligne.
	 * @return Texte du paragraphe
	 */
	@Override
	public String toString() {
		calculeLignes();
		StringBuilder resultat = new StringBuilder();
		for (int i=0; i<nbLignes; i++) {
			resultat.append(lignes[i] + '\n');
		}
		return resultat.toString();
	}
}
