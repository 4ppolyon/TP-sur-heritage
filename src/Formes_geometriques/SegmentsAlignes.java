package Formes_geometriques;

class SegmentsAlignes
{
    public static void tracerSegmentProgressivement(MachineTrace m, double x, double y,
                                                    double angle, double l) {
        m.lever();
        m.placer(x, y);
        m.orienter(angle);
        m.baisser();
        for (double i=0; i<l; i+=10) {
            m.avancer(10);
        }
    }

    public static int choisirCouleur(int i) {
        if (i == 0)
            return MachineTrace.NOIR;
        else if (i == 1)
            return MachineTrace.BLANC;
        else if (i == 2)
            return MachineTrace.JAUNE;
        else if (i == 3)
            return MachineTrace.ROUGE;
        else if (i == 4)
            return MachineTrace.VERT;
        else if (i == 5)
            return MachineTrace.BLEU;
        else
            return MachineTrace.NOIR;
    }


    public static void main(String [] args) {
        MachineTrace m = new MachineTrace(400,400);
        int n=20, d=10;
        double x, y;

        // Attend automatiquement après chaque commande
        // Permet de voir le dessin se construire
        m.attenteAutomatique(10);

        // Première série de tracés sans le pointeur
        m.masquerPointeur();
        for (int i=0; i<=n; i++) {
            x = -50;
            y = i*d-100;
            m.changeCouleur(choisirCouleur(i%6));
            tracerSegmentProgressivement(m, x, y, 45, 100);
        }

        // Seconde série de tracés avec le pointeur
        m.effacerTout();
        m.montrerPointeur();
        for (int i=0; i<=n; i++) {
            x = 50;
            y = i*d-100;
            m.changeCouleur(choisirCouleur(i%6));
            tracerSegmentProgressivement(m, x, y, 135, 100);
        }
    }
}