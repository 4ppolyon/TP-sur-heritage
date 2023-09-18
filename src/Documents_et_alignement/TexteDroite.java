package Documents_et_alignement;

public class TexteDroite extends Texte{
    public TexteDroite(String t) {
        super(t);
    }

    @Override
    public String toString() {
        StringBuilder resultat = new StringBuilder();
        if (texte.length() < largeur) {
            int space = largeur - texte.length();
            for (int i = 0; i < space; i++) {
                resultat.append(' ');
            }
            resultat.append(texte);
        }
        else {
            resultat.append(texte);
        }
        return resultat.toString();
    }
}
