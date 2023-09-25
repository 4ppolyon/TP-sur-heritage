package Formes_geometriques;

public class Losange extends Forme{
    MachineTrace m;
    public Losange(MachineTrace m) {
        super();
        this.m = m;
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
