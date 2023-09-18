package Documents_et_alignement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

public class TestDocument {
	/**
	 * Test de la classe <tt>Document</tt> :
	 * <ul>
	 * <li>construit un document à partir d'un entête donné et du fichier <tt>Candide.txt</tt> fourni
	 * <li>fixe la largeur du document à 80 (défaut) ou à la valeur donné en argument
	 * <li>affiche le document
	 * </ul>
	 * @param args Largeur souhaitée (1er argument)
	 */
	public static void main(String[] args) {
		String nomFichier = "Candide.txt";
		try {
			InputStream in = new FileInputStream(nomFichier);
			int format = 80;
			if (args.length > 0)
				format = Integer.parseInt(args[0]);
			Calendar cal = Calendar.getInstance();
			cal.set(1759, 01, 01);
			Date uneDate = cal.getTime();
			Entete e = new Entete("Candide", "Voltaire", uneDate);

			Document d = new Document(e, in);

			d.fixeLargeur(format);
			d.ecris(System.out);
		} catch (FileNotFoundException e) {
			System.err.println("Impossible de trouver " + nomFichier);
		}
	}
}
