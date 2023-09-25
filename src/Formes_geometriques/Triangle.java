package Formes_geometriques;

public class Triangle extends Forme {

    Triangle(MachineTrace m) {
        super();
        this.m = m;
    }
    public void dessin_specifique() {
        m.baisser();
        m.placer(positionX + taille, positionY);
        m.placer(positionX + (double) taille/2, positionY + taille);
        m.placer(positionX, positionY);
    }
}
