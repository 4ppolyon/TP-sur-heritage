public class ABC {
    public static void main(String [] args) {
        A objet = new C();
        System.out.println(objet.un(42));
        System.out.println(objet.un('X'));
        System.out.println(objet.un("42"));
        System.out.println(objet.deux());
    }
}