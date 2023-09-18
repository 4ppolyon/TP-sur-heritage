package Documents_et_alignement;

public class ParagrapheDroite extends Paragraphe{

    public ParagrapheDroite() {
        super();
    }
    @Override
    public String toString() {
        calculeLignes();
        StringBuilder resultat = new StringBuilder();
        for (int i=0; i<nbLignes; i++) {
            if (lignes[i].length() < largeur) {
                int space = largeur - lignes[i].length();
                for (int j = 0; j < space; j++) {
                    resultat.append(' ');
                }
                resultat.append(lignes[i] + '\n');
            }
            else {
                resultat.append(lignes[i] + '\n');
            }
        }
        return resultat.toString();
    }
}
