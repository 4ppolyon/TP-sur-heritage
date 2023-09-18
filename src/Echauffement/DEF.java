package Echauffement;

public class DEF {
    public static void main(String [] args) {
        D objet = new F();
        System.out.println(objet.un(42));
        System.out.println(objet.un('X'));
        System.out.println(objet.un("42"));
        System.out.println(objet.deux());
    }
}