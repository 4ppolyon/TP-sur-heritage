package Formes_geometriques;

public class Carre extends Forme {
    int taille;
    MachineTrace m;
    public Carre(MachineTrace m) {
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
        m.avancer(taille);
        m.tournerGauche(90);
        m.avancer(taille);
        m.tournerGauche(90);
        m.avancer(taille);
        m.tournerGauche(90);
        m.avancer(taille);
        m.tournerGauche(90);
    }
}
