package Documents_et_alignement;

public class TexteCentre extends Texte {
	public TexteCentre(String t) {
		super(t);
	}
	@Override
	public String toString() {
		int justification;
		StringBuilder resultat = new StringBuilder();

		justification = (largeur - texte.length()) / 2;
		for (int i = 0; i < justification; i++) {
			resultat.append(' ');
		}
		resultat.append(texte);
		return resultat.toString();
	}
}
