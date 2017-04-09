package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	private Twitter t;
	private TwitterPoruka tp;

	@Before
	public void setUp() throws Exception {
		t=new Twitter();
		tp=new TwitterPoruka();
		
	}

	@After
	public void tearDown() throws Exception {
		t=null;
		tp=null;
	}

	@Test
	public void testVratiSvePoruke() {
		t.unesi("Dzo", "poruka poruka");
		assertEquals(1,t.vratiSvePoruke().size());
		assertEquals("Dzo",t.vratiSvePoruke().get(0).getKorisnik());
		assertEquals("poruka poruka",t.vratiSvePoruke().get(0).getPoruka());
		
		
	}

	@Test
	public void testUnesi() {
		tp.setKorisnik("Dzo");
		tp.setPoruka("poruka");
		t.unesi(tp.getKorisnik(), tp.getPoruka());
		
		assertEquals(1,t.vratiSvePoruke().size());
		assertEquals("Dzo",t.vratiSvePoruke().getLast().getKorisnik());
		assertEquals("poruka", t.vratiSvePoruke().getLast().getPoruka());
		
	}

	@Test
	public void testVratiPoruke() {
		t.unesi("Dzo", "poruka na twitteru");
		t.unesi("Ana", "blablabla");
		t.unesi("Box", "pisem poruku");
		t.unesi("Milica", "poruka poruka");
		
		assertEquals(t.vratiSvePoruke().get(0),t.vratiPoruke(10, "poruka")[0]);
		assertEquals(t.vratiSvePoruke().get(3), t.vratiPoruke(10, "poruka")[1]);
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagNull(){
		t.vratiPoruke(10, null);
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagPrazan(){
		t.vratiPoruke(10,"");
	}

}
