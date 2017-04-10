/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jovana Lazic
 *
 */
public class TwitterPorukaTest {
	private TwitterPoruka t;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		t=new TwitterPoruka();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		t=null;
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		t.setKorisnik("Joce");
		
		assertEquals("Joce",t.getKorisnik());
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull(){
		t.setKorisnik(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazanString(){
		t.setKorisnik("");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	@Test 
	public void testSetPoruka() {
		t.setPoruka("Twit twit");
		assertEquals("Twit twit",t.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull(){
		t.setPoruka(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazanString(){
		t.setKorisnik("");
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaDuzaOd140(){
		t.setPoruka("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				);
		
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	@Test
	public void testToString() {
		t.setKorisnik("Joce");
		t.setPoruka("bla");
		assertEquals("KORISNIK:Joce PORUKA:bla",t.toString());
	}
	
	
	

}
