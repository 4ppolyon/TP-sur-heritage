package Formes_geometriques;

public abstract class Forme {
    int positionX;
    int positionY;
    int taille;

    void fixerPosition(int x, int y) {
        positionX = x;
        positionY = y;
    }
    void fixerTaille(int t){
        taille = t;
    }
    void dessiner() {
        throw new RuntimeException("Méthode non implémentée");
    }
}
