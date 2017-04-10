package com.twitter;
import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;
/**
 * Klasa predstavlja grupu poruka na Twitteru, napisanih od strane razlicitih autora
 * @author Jovana Lazic
 * @version 1.0
 *
 */

public class Twitter {
	/**
	 * Lista poruka.
	 */
		private LinkedList<TwitterPoruka> poruke =
			new LinkedList<TwitterPoruka>();
		/**
		 * 
		 * @return listu poruka kao listu objekata klase LinkedList
		 */
		public LinkedList<TwitterPoruka> vratiSvePoruke(){
		return poruke;
	}
	
		/**
		 * Metoda pravi novi objekat klase TwitterPoruka i postavlja vrednosti atributa na one koje se unose u vidu parametra
		 * zatim unosti poruku na kraj liste poruka
		 * @param korisnik novi username korisnika
		 * @param poruka novi tekst poruke
		 */
	public void unesi(String korisnik, String poruka) {
	//Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		//Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}
	
	/**
	 * Metoda prolazi kroz sve poruke u listi poruke i vraca one koje sadrze odredjeni tag
	 * @param maxBroj maksimalan broj poruka koji se vraca, ako se negativan broj ili nula onda se postavlja vrednost 100
	 * @param tag rec koja se pretrazuje
	 * @return rezulat u vidu niza objekata klase TwitterPoruka
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag==null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
		//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj<=0)
			maxBroj = 100;
		//Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		//sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		//Pretrazuju se poruke i traze se one koje sadrze tag.
		//Ako se nadje neka takva, i ako nije prekoracen maxBroj
		//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		//se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
				if (brojac < maxBroj){
					rezultat[brojac]=poruke.get(i);
					brojac++;
				}
				else break;
		return rezultat;
	}
}
