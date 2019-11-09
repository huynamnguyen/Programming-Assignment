package reiseagentur;

import java.util.ArrayList;

/**
 * 
 * @author nam_n
 *
 */

public class Reiseagentur {
	private String name, ustidnr, b;
	Adresse adresse = new Adresse("Hauptstraße", "5a", "10559", "Berlin");
	ArrayList<Kunde> kunde = new ArrayList();
	/**
	 *  Konstruktor der Klasse Reiseagentur
	 * @param n
	 * @param u
	 */
	public Reiseagentur(String n, String u) {
		this.name = n;
		this.ustidnr = u;
	}
	
	/**
	 * fügt der Klasse Reiseagentur ein Objekt der Klasse Kunde in die ArrayList kunde hinzu
	 * @param k
	 */
	public void addKunde(Kunde k) {
		kunde.add(k);
	}
	
	/**
	 * @return sämtliche Daten der Klasse Reiseagentur als String
	 */
	public String toString() {
		String a = "Reiseagentur: " + this.name + "\nUST-IDNR: " + this.ustidnr + this.adresse;
		for (Kunde k : kunde) {
			b = b + k;
		}
		return a +"\n"+ b;
	}
}
