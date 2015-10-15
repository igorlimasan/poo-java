import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramaTeste {

	@Test
	public void test() {
		assertTrue(Anagrama.saoAnagrama("",""));
		assertTrue(Anagrama.saoAnagrama(" ",""));
		assertTrue(Anagrama.saoAnagrama("a","a "));
		assertFalse(Anagrama.saoAnagrama("a ","b"));
		assertTrue(Anagrama.saoAnagrama("ab","ab"));
		assertTrue(Anagrama.saoAnagrama("ab","a b"));
		assertTrue(Anagrama.saoAnagrama("b a","a b"));
		assertTrue(Anagrama.saoAnagrama("ab", "ba"));
		assertFalse(Anagrama.saoAnagrama("ba", "a"));
		assertTrue(Anagrama.saoAnagrama("amor", "roma"));
		assertTrue(Anagrama.saoAnagrama("alan smithee", "the alias men"));
		assertFalse(Anagrama.saoAnagrama("amoor", "roma"));
		assertFalse(Anagrama.saoAnagrama("Batata", "Banana"));
	}

}
