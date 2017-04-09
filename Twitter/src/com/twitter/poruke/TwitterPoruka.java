package com.twitter.poruke;
/**
 * Klasa predstavlja poruku na Twitteru
 * @author Jovana Lazic
 *
 */

	public class TwitterPoruka {
		/**
		 * Username korisnika.
		 */
		private String korisnik;
		
		/**
		 * Tekst poruke.
		 */
		private String poruka;
		
		/**
		 * Vraca vrednost atributa korisnik.
		 * @return username korisnika kao String
		 */
		public String getKorisnik() {
			
			return korisnik;
	}
		/**
		 * Postavlja vrednost atributa korisnik na onu vrednost koja se unosi kao parametar
		 * @param korisnik novi username korisnika
		 * @throws RuntimeException u slucaju da je unet prazan string ili null vrednost kao parametar
		 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || !korisnik.isEmpty())
			throw new RuntimeException(
					"Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * Vraca vrednost atributa poruka.
	 * @return String vrednost - tekst poruke
	 */
	public String getPoruka() {
		return "poruka";
	}
	
	/**
	 * Postavlja vrednost atributa poruka na onu vrednost koja se unosi kao parametar
	 * @param poruka novi tekst poruke
	 * @throws RuntimeException u slucaju da je unet prazan string ili null vrednost kao parametar
	 */
	public void setPoruka(String poruka) {
		if (this.poruka==null || this.poruka == new String("") ||
				this.poruka.length()>140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	/**Vraca string vrednost sa podacima o korisniku i poruci
	 * @return String username korisnika i tekst poruke uz odgovorajuci tekst
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;

	}
}	
