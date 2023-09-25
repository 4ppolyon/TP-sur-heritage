package Formes_geometriques;

public class Cercle extends Forme{
    int taille;
    MachineTrace m;
    public Cercle(MachineTrace m) {
        super();
        this.m = m;
    }
    public void fixerPosition(int x, int y) {
        m.placer(x, y);
    }
    public void fixerTaille(int t) {
        taille = t;
    }
    public void dessiner() {
        m.placer(-taille, -taille);
        m.baisser();
        for(int i = 0; i < taille; i++) {
            m.avancer((double) 360 /taille);
            m.tournerGauche((double) 360 /taille);
        }
        m.lever();
    }
}
