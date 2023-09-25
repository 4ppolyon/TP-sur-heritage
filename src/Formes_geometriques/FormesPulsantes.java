package Formes_geometriques;
import java.util.Random;

/**
 * Programme de base fournit pour le TP, se référer au TP pour les détails.
 * @author Guillaume Huard
 */
public class FormesPulsantes {
    final static int nbFormes = 4;
    final static int nbObjets = 10;
    final static int etapesPulsations = 1000;
    final static int amplitudePulsation = 350;
    final static int delai = 2;

    static Forme creerForme(int type, MachineTrace m) {
        switch (type) {
            case 0:
                return new Carre(m);
            case 1:
                return new Triangle(m);
            case 2:
                return new Cercle(m);
            case 3:
                return new Losange(m);
            default:
                throw new RuntimeException("Forme Inconnue");
        }
    }

    public static void main(String[] args) {
        MachineTrace m;
        Forme[] f;
        int[] tailles;
        Random r;

        m = new MachineTrace(1200, 1200);
        m.masquerPointeur();
        m.rafraichissementAutomatique(false);

        f = new Forme[nbObjets];
        tailles = new int[f.length];
        r = new Random();
        for (int i = 0; i < f.length; i++) {
            f[i] = creerForme(r.nextInt(nbFormes), m);
            f[i].fixerPosition(r.nextInt(200) - 100, r.nextInt(200) - 100);
            tailles[i] = r.nextInt(20) + 5;
        }

        while (true) {
            for (int j = 0; j <= etapesPulsations; j++) {
                m.effacerTout();
                int ajout = (int) (amplitudePulsation * (Math.sin(j * 2 * Math.PI / etapesPulsations) + 1) / 2);
                for (int i = 0; i < f.length; i++) {
                    f[i].fixerTaille(tailles[i] + ajout);
                    f[i].dessiner();
                }
                m.rafraichir();
                m.attendre(delai);
            }
        }
    }
}