package reiseagentur;

/**
 * 
 * @author nam_n
 *
 */

public class Adresse {
	private String strasse, hausnummer, postleitzahl, ort;
	/**
	 * Konstruktor der Klasse Adresse
	 * @param s
	 * @param h
	 * @param p
	 * @param o
	 */
	public Adresse(String s, String h, String p, String o) {
		this.strasse = s;
		this.hausnummer = h;
		this.postleitzahl = p;
		this.ort = o;
	}
	/**
	 * @return gibt sämtliche Daten der Klasse Adresse als String zurück
	 */
	public String toString() {
		return "\nStrasse: " + this.strasse + " " + this.hausnummer + "\nPostleitzahl: " + this.postleitzahl + "\nOrt:" + this.ort;
	}
}
