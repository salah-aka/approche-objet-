package fr.diginamic.utils;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void testlevenshteinDistance() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("chien", "chine");
			assertEquals(2, resultat);
		} catch (IncorrectParametreException e) {
			fail();
		}
	}

	@Test
	public void testlevenshteinDistance1() {
		int resultat1;
		try {
			resultat1 = StringUtils.levenshteinDistance("avion", "aviron");
			assertEquals(1, resultat1);
		} catch (IncorrectParametreException e) {
			fail();
		}
	}

	@Test
	public void testlevenshteinDistance2() {
		int resultat2;
		try {
			resultat2 = StringUtils.levenshteinDistance("aviron", "avion");
			assertEquals(1, resultat2);
		} catch (IncorrectParametreException e) {
			fail();
		}
	}

	@Test
	public void testlevenshteinDistance3() {
		int resultat3;
		try {
			resultat3 = StringUtils.levenshteinDistance("", "avion");
			assertEquals(5, resultat3);
		} catch (IncorrectParametreException e) {
			fail();
		}
	}

	@Test(expected = IncorrectParametreException.class)
	public void testlevenshteinDistance4() throws IncorrectParametreException {
		int resultat4 = StringUtils.levenshteinDistance(null, "avion");
	
		assertEquals(5, resultat4);

	}
}
