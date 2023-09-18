package Documents_et_alignement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestEntete {
	/**
	 * Test de la classe Entête :
	 * <ul>
	 * <li>construit un entête pour l'oeuvre "Candide" (date fixée) et l'affiche avec une largeur de 50
	 * <li>construit un second entête avec la date du jour et l'affiche avec la largeur par défaut
	 * </ul>
	 * @param args non utilisé
	 */
	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		cal.set(1759, 01, 01);
		Date uneDate = cal.getTime();
		SimpleDateFormat miseEnForme = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Premier entête, date fixée au " + miseEnForme.format(uneDate) + " :");
		Entete e = new Entete("Candide", "Voltaire", uneDate);
		e.fixeLargeur(50);
		System.out.println(e);

		System.out.println();
		uneDate = new Date();
		System.out.println("Second entête, date du jour (" + miseEnForme.format(uneDate) + ") :");
		e = new Entete("Improvisation", "Guillaume Huard");
		System.out.println(e);
	}
}
