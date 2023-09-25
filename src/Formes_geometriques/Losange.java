package Formes_geometriques;

public class Losange extends Forme{
    int taille;
    MachineTrace m;
    int positionX;
    int positionY;
    public Losange(MachineTrace m) {
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
        m.tournerGauche(135);
        m.avancer(taille);
        m.tournerGauche(135);
        m.avancer(taille);
        m.tournerGauche(45);
        m.avancer(taille);
        m.tournerGauche(135);
        m.avancer(taille);
        m.tournerGauche(45);
        m.lever();
    }
}
