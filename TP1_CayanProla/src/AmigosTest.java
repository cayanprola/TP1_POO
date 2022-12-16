import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AmigosTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAmigos() {
		Amigos a = new Amigos();
		Amigos a2 = new Amigos();
		assertFalse(a.equals(a2));
	}

	@Test
	void testAmigosFigurinhasIntInt() {
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };
		int qtd[] = { 2, 3, 9, 8 };
		int colecao[][] = { { 2, 3, 4, 9, 10 }, { 0, 1, 2 } };
		Figurinhas fa = new Figurinhas(qtd, s, colecao);
		int index = 21;
		int trocas = 50;
		Amigos a = new Amigos(fa, index, trocas);
		Amigos a2 = new Amigos(fa, index, trocas);
		assertFalse(a.equals(a2));
	}

	@Test
	void testGetters() {
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };
		int qtd[] = { 2, 3, 9, 8 };
		int colecao[][] = { { 2, 3, 4, 9, 10 }, { 0, 1, 2 } };
		Figurinhas fa = new Figurinhas(qtd, s, colecao);
		int index = 21;
		int trocas = 50;
		Amigos a = new Amigos(fa, index, trocas);
		assertEquals(a.getFa(), fa);
		assertEquals(a.getIndex(), index);
		assertEquals(a.getTrocas(), trocas);
	}

	@Test
	void testSetters() {
		String[] s = new String[] { "QAT", "ECU", "SEN", "NED", "ENG", "IRN", "USA", "WAL", "ARG", "KSA", "MEX", "POL",
				"FRA", "AUS", "DEN", "TUN", "ESP", "CRC", "GER", "JPN", "BEL", "CAN", "MAR", "CRO", "BRA", "SRB", "SUI",
				"CMR", "POR", "GHA", "URU", "KOR" };
		int qtd[] = { 2, 3, 9, 8 };
		int colecao[][] = { { 2, 3, 4, 9, 10 }, { 0, 1, 2 } };
		Figurinhas fa = new Figurinhas(qtd, s, colecao);
		int index = 21;
		int trocas = 50;
		Amigos a = new Amigos(fa, index, trocas);
		fa.setQtd(qtd);
		fa.setSelecao(s);
		fa.setColecao(colecao);
		a.setIndex(index);
		a.setTrocas(trocas);
		assertTrue(a.getFa() == fa);
		assertTrue(a.getIndex() == index);
		assertTrue(a.getTrocas() == trocas);
	}

}
