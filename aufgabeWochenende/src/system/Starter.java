package system;

import reiseagentur.Adresse;
import reiseagentur.Anrede;
import reiseagentur.Bezahlmethode;
import reiseagentur.Kunde;
import reiseagentur.Reiseagentur;

/**
 * 
 * @author nam_n
 * @version 
 * Erstellungsdatum: 25.10.2019
 * Beschreibung: Für den Test der Anwendung ist die „Magic Holidays Reiseagentur“ mit der UST-IDNR
				 DE812524001 und der Adresse Hauptstraße 5a, 10559 Berlin zu erzeugen. Die Reiseagentur
				 soll drei unterschiedliche Kunden haben. 
				 Mit dem Start des Programms werden auf der Konsole sämtliche Daten der Reiseagentur und
				 der drei angelegten Kunden mit den jeweiligen Stammdaten ausgegeben.
 */

public class Starter {

	public static void main(String[] args) {
		/**
		 * Die Reiseagentur wird mittels Konstruktor erstellt und erhält vorgegebenen Werte 
		 */
		Reiseagentur reiseagentur = new Reiseagentur("Magic Holidays Reiseagentur", "DE812524001");
		/**
		 * Die jeweiligen Adressen für jeden Kunden werden erstellt
		 */
		Adresse a1 = new Adresse("Invalidenstrasse", "61a", "14059", "Berlin");
		Adresse a2 = new Adresse("Athenenstrasse", "1", "14467", "Potsdam");
		Adresse a3 = new Adresse("Bucher Damm", "13", "13125", "Berlin");
		/**
		 * Die Bezahlmethoden werden erstellt
		 */
		Bezahlmethode b1 = new Bezahlmethode("PayPal", "faulitzf@outlook.de");
		Bezahlmethode b2 = new Bezahlmethode("Lastschrift", "klklkl@hotmail.de");
		Bezahlmethode b3 = new Bezahlmethode("Kreditkarte", "gina_g@web.de");
		Bezahlmethode b4 = new Bezahlmethode("PayPal", "gina_g@web.de");
		/**
		 * die Kunden werden erstellt
		 */
		Kunde k1 = new Kunde("Fritz", "Faulitz", "20.01.1994", "0157827394", "faulitzf@outlook.de", "9037210372");
		Kunde k2 = new Kunde("Kevin", "Larsen", "01.05.1990", "0175792835", "klklkl@hotmail.de", "4974827085");
		Kunde k3 = new Kunde("Gina", "Gertrud", "14.12.2000", "0161083205", "gina_g@web.de", "1208302840");
		/**
		 * Jeder Kunde bekommt eine aus der Enumeration Anrede vordefinierte Anrede (Frau/Herr)
		 */
		k1.setAnrede(Anrede.Herr);
		k2.setAnrede(Anrede.Herr);
		k3.setAnrede(Anrede.Frau);
		/**
		 * Jedem Kunden wird mindestens eine Bezahlmethode hinzugefügt
		 */
		k1.addBezahlmethode(b1);
		k2.addBezahlmethode(b2);
		k3.addBezahlmethode(b3);
		k3.addBezahlmethode(b4);
		/**
		 * Jedem Kunden wird eine bis zwei Adressen hinzugefügt, welche oben erstellt wurden
		 */
		k1.setAdresse(a1);
		k2.setAdresse(a2);
		k2.setAdresse(a3);
		/**
		 * Die Kunden werden der Reiseagentur hinzugefügt
		 */
		reiseagentur.addKunde(k1);
		reiseagentur.addKunde(k2);
		reiseagentur.addKunde(k3);
		/**
		 * Die Reiseagentur wird mit den Kunden und deren jeweiligen Stammdaten ausgegeben
		 */
		System.out.println(reiseagentur);
	}

}
