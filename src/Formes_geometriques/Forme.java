package Formes_geometriques;

public abstract class Forme {
    void fixerPosition(int x, int y) {
        throw new RuntimeException("Méthode non implémentée");
    }
    void fixerTaille(int t) {
        throw new RuntimeException("Méthode non implémentée");
    }
    void dessiner() {
        throw new RuntimeException("Méthode non implémentée");
    }
}
