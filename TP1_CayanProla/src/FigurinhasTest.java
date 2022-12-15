import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FigurinhasTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFigurinhas() {
		Figurinhas f = new Figurinhas();
		Figurinhas f2 = new Figurinhas();
		assertFalse(f.equals(f2));
	}

	@Test
	void testFigurinhasIntArrayStringArrayIntArrayArray() {
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };
		int qtd[] = { 2, 3, 9, 8 };
		int colecao[][] = { { 2, 3, 4, 9, 10 }, { 0, 1, 2 } };
		Figurinhas f = new Figurinhas(qtd, s, colecao);
		Figurinhas f2 = new Figurinhas(qtd, s, colecao);
		assertFalse(f.equals(f2));
	}

	@Test
	public void testGetters() {
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };
		int qtd[] = { 2, 3, 9, 8 };
		int colecao[][] = { { 2, 3, 4, 9, 10 }, { 0, 1, 2 } };
		Figurinhas f = new Figurinhas(qtd, s, colecao);
		assertEquals(f.getQtd(), qtd);
		assertEquals(f.getSelecao(), s);
		assertEquals(f.getColecao(), colecao);
	}

	@Test
	public void testSetters() {
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };
		int qtd[] = { 2, 3, 9, 8 };
		int colecao[][] = { { 2, 3, 4, 9, 10 }, { 0, 1, 2 } };
		Figurinhas f = new Figurinhas(qtd, s, colecao);
		f.setQtd(qtd);
		f.setSelecao(s);
		f.setColecao(colecao);
		assertTrue(f.getQtd() == qtd);
		assertTrue(f.getSelecao() == s);
		assertTrue(f.getColecao() == colecao);
	}

}
