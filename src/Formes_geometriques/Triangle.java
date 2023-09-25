package Formes_geometriques;

public class Triangle extends Forme {
    MachineTrace m;
    int taille;
    int positionX;
    int positionY;

    Triangle(MachineTrace m) {
        super();
        this.m = m;
    }
    void fixerPosition(int x, int y) {
        positionX = x;
        positionY = y;
    }
    void fixerTaille(int t){
        taille = t;
    }
    void dessiner() {
        m.placer(positionX, positionY);
        m.baisser();
        m.placer(positionX + taille, positionY);
        m.placer(positionX + (double) taille/2, positionY + taille);
        m.placer(positionX, positionY);
        m.lever();
    }
}
