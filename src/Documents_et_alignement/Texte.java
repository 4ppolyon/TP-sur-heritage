package Documents_et_alignement;

public abstract class Texte {
    protected String texte;
    protected int largeur;

    public Texte(String t) {
        texte = t;
        largeur = 80;
    }

    public void fixeLargeur(int l) {
        largeur = l;
    }

    public String texte() {
        return texte;
    }

    @Override
    public String toString() {
        return texte;
    }
}
