package Documents_et_alignement;

public class TestTexte {
    public static void main(String[] args){
        TexteCentre texte = new TexteCentre("Hello World!");
        texte.fixeLargeur(80);
        String t = texte.texte();
        //System.out.println(t);
        String t2 = texte.toString();
        System.out.println(t2);
    }
}
