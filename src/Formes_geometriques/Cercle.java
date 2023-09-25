package Formes_geometriques;

public class Cercle extends Forme{
    public Cercle(MachineTrace m) {
        super();
        this.m = m;
    }
    public void dessin_specifique() {
        m.avancer((double) taille / 2);
        m.baisser();
        m.tournerGauche(90);
        for (int i = 0; i < 360; i++) {
            m.avancer(Math.PI * taille / 360);
            m.tournerGauche(1);
        }
        m.tournerDroite(90);
    }
}