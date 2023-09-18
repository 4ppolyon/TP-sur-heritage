package Documents_et_alignement;

public class ParagrapheGauche extends Paragraphe {

    public ParagrapheGauche() {
        super();
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
