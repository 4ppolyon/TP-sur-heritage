package Formes_geometriques;

public abstract class Forme {
    int positionX;
    int positionY;
    int taille;
    MachineTrace m;
    void fixerPosition(int x, int y) {
        positionX = x;
        positionY = y;
    }
    void fixerTaille(int t){
        taille = t;
    }
    void dessin_specifique() {
        // dessin spécifique à chaque forme
    }
    void dessiner() {
        m.placer(positionX, positionY);
        dessin_specifique();
        m.lever();
    }
}
