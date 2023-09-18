package Echauffement;

public class B extends A {
    String un(int n) {
        return un(Integer.toString(n));
    }
    String un(char x) {
        return "Echauffement.B un " + x;
    }
    String un(String s) {
        return "Echauffement.B un " + s;
    }
}