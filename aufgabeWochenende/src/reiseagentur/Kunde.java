package reiseagentur;

import java.util.ArrayList;

/**
 * 
 * @author nam_n
 *
 */

public class Kunde {
	private String kundennummer, vorname, nachname, geburtsdatum, telefonnummer, email;
	private Anrede anrede;
	private Adresse adresse;
	/*
	 * dieser integer dient zum Sicherstellen, das keine Bezahlmethode hinzugefügt wird, wenn es mehr als 3 sind und das kein Slot ueberschrieben wird
	 * wird in der Methode addBezahlmethode verwendet
	 */
	private static int i = 0;
	ArrayList<Bezahlmethode> bMethoden = new ArrayList<>();
	/**
	 * Der Konstruktor der Klasse Kunde
	 * @param v
	 * @param n
	 * @param g
	 * @param t
	 * @param e
	 * @param k
	 */
	public Kunde(String v, String n, String g, String t, String e, String k) {
		this.vorname = v;
		this.nachname = n;
		this.geburtsdatum = g;
		this.telefonnummer = t;
		this.email = e;
		this.kundennummer = k;
	}
	/**
	 * Die Methode fügt der Arraylist bMethoden eine Bezahlmethode hinzu, 
	 * sobald die Arraylist mehr als 3 Objekte besitzt, wird kein neues 
	 * Objekt hinzugefügt
	 * @param bM
	 */
	public void addBezahlmethode(Bezahlmethode bM) {
		if (bMethoden.size() < 4) {
		bMethoden.add(bM);
		} else {
			System.out.println("Zu viele Bezahlmethoden.");
		}
	}
	/**
	 * Methode um die Anrede festzulegen
	 * @param anr
	 */
	public void setAnrede(Anrede anr) {
		this.anrede = anr;
	}
	/**
	 * Methode um den Wert von Anrede zu bekommen
	 * @return anrede
	 */
	public Anrede getAnrede() {
		return this.anrede;
	}
	/**
	 * Methode um die Adresse festzulegen
	 * @param a1
	 */
	public void setAdresse(Adresse a) {
		this.adresse = a;
	}
	/**
	 * Methode um den Wert der Adresse zu bekommen
	 * @return adresse1
	 */
	public Adresse getAdresse() {
		return this.adresse;
	}
	/**
	 * @return sämtliche Daten der Klasse Kunde als String
	 */
	public String toString() {
		return "\n-------------------------------------------------"+ "\nAnrede: " + this.anrede + "\nVorname: " + this.vorname + "\nNachname: " + this.nachname + "\nGeburtsdatum: " + this.geburtsdatum + "\nTelefonnummer: " + this.telefonnummer + 
				   "\nEmail: " + this.email + "\nKundennummer: " + this.kundennummer + "\nBezahlmethoden: \n" + bMethoden.toString() + "\n\nAdresse: " + this.adresse;
		
		
	} 
}
