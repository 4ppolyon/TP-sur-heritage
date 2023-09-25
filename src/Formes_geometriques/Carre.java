package Formes_geometriques;

public class Carre extends Forme {
    MachineTrace m;
    public Carre(MachineTrace m) {
        super();
        this.m = m;
    }
    public void dessiner() {
        m.placer(positionX, positionY);
        for (int i = 0; i < 4; i++) {
            m.baisser();
            m.avancer(taille);
            m.tournerGauche(90);
        }
        m.lever();
    }
}
