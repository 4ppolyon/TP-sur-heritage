package Documents_et_alignement;

public class TestTexte {
    public static void main(String[] args) {
        String t = "Hello World!";
        TexteGauche texte1 = new TexteGauche(t);
        TexteCentre texte2 = new TexteCentre(t);
        TexteDroite texte3 = new TexteDroite(t);
        texte1.fixeLargeur(80);
        texte2.fixeLargeur(80);
        texte3.fixeLargeur(80);
        String t1 = texte1.toString();
        String t2 = texte2.toString();
        String t3 = texte3.toString();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
