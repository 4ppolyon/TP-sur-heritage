package Formes_geometriques;

public class Carre extends Forme {
    public Carre(MachineTrace m) {
        super();
        this.m = m;
    }
    public void dessin_specifique() {
        m.baisser();
        m.placer(positionX, positionY);
        for (int i = 0; i < 4; i++) {
            m.baisser();
            m.avancer(taille);
            m.tournerGauche(90);
        }
        m.lever();
    }
}
