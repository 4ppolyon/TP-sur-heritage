package Documents_et_alignement;

public class TestTexte {
    public static void main(String[] args){
        TexteDroite texte = new TexteDroite("Hello World!");
        texte.fixeLargeur(80);
        String t2 = texte.toString();
        System.out.println(t2);
    }
}
