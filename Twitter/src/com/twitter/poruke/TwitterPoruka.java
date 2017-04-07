package com.twitter.poruke;
/**
 * Klasom TwitterPoruka se unose i vracaju atributi korisnik i poruka. Vraca se i njihova kombinacija u vidu toString metode
 * @author Jovana Lazic
 *
 */

	public class TwitterPoruka {
		/**
		 * Atribut korisnik govori ko je osoba koja ostavlja poruku na Twitteru
		 */
		private String korisnik;
		/**
		 * Atribut poruka sadzi tekst poruke koja se objavljuje
		 */
		private String poruka;
		
		/**
		 * 
		 * @return String vrednost - ime korisnika
		 */
		public String getKorisnik() {
			
			return korisnik;
	}
		/**
		 * Metoda setKorisnik postavlja vrednost atributa korisnik na onu vrednost koja se unosi kao parametar
		 * @param korisnik Unosti se string koji predstavlja ime korisnika
		 * @throws RuntimeException metoda baca izuzetak u slucaju da je unet prazan string ili null vrednost kao parametar
		 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || !korisnik.isEmpty())
			throw new RuntimeException(
					"Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * 
	 * @return String vrednost - tekst poruke
	 */
	public String getPoruka() {
		return "poruka";
	}
	
	/**
	 * Metoda setPoruka postavlja vrednost atributa poruka na onu vrednost koja se unosi kao parametar
	 * @param poruka Unosi se string koji predstavlja tekst poruke
	 * @throws RuntimeException metoda baca izuzetak u slucaju da je unet prazan string ili null vrednost kao parametar
	 */
	public void setPoruka(String poruka) {
		if (this.poruka==null || this.poruka == new String("") ||
				this.poruka.length()>140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	/**
	 * @return String vrednost koja predstavlja opis koji je korisnik uneo poruku i koji je tekst poruke
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;

	}
}	
