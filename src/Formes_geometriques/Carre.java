package Formes_geometriques;

public class Carre extends Forme {
    int taille;
    MachineTrace m;
    int positionX;
    int positionY;
    public Carre(MachineTrace m) {
        super();
        this.m = m;
    }
    public void fixerPosition(int x, int y) {
        positionX = x;
        positionY = y;
    }
    public void fixerTaille(int t) {
        taille = t;
    }
    public void dessiner() {
        m.placer(positionX, positionY);
        m.baisser();
        m.placer(positionX + taille, positionY);
        m.tournerGauche(90);
        m.placer(positionX + taille, positionY + taille);
        m.tournerGauche(90);
        m.placer(positionX, positionY + taille);
        m.tournerGauche(90);
        m.placer(positionX, positionY);
        m.lever();
        m.tournerGauche(90);
    }
}
