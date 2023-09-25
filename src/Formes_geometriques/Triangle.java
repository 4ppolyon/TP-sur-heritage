package Formes_geometriques;

public class Triangle extends Forme {
    MachineTrace m;

    Triangle(MachineTrace m) {
        super();
        this.m = m;
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
