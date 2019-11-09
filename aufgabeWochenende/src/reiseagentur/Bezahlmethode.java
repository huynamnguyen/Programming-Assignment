package reiseagentur;

/**
 * 
 * @author nam_n
 *
 */

public class Bezahlmethode {
	private String beschreibung, kurzbeschreibung;
	/**
	 * Konstruktor der 
	 * @param b
	 * @param k
	 */
	public Bezahlmethode(String b, String k) {
		this.beschreibung = b;
		this.kurzbeschreibung = k;
	}
	/**
	 * @return gibt s�mtliche Daten der Klasse Bezahlmethode als String zur�ck
	 */
	public String toString() {
		return "\nBeschreibung: "  + this.beschreibung + "\nKurzbeschreibung: " + this.kurzbeschreibung;
	}
}
