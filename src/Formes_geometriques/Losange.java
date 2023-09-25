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
        m.placer(positionX + (double) 3*taille/4, positionY + (double) taille/4);
        m.placer(positionX + taille, positionY + taille);
        m.placer(positionX + (double) taille/4, positionY + (double) 3*taille/4);
        m.placer(positionX, positionY);
        m.lever();
    }
}
