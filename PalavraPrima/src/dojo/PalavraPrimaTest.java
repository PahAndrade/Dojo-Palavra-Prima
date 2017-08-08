package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalavraPrimaTest {

	@Test
	public void testConverteLetraAMinusculo() {
		int valor = PalavraPrima.converteEmNumero("a");
		assertEquals(1, valor);
	}

	@Test
	public void testConverteLetraBMinusculo() {
		int valor = PalavraPrima.converteEmNumero("b");
		assertEquals(2, valor);
	}

	@Test
	public void testConverteLetraAMaisculo() {
		int valor = PalavraPrima.converteEmNumero("A");
		assertEquals(27, valor);
	}

	@Test
	public void testConverteLetraZMinusculo() {
		int valor = PalavraPrima.converteEmNumero("z");
		assertEquals(26, valor);
	}

	@Test
	public void testConverteLetraZMaiusculo() {
		int valor = PalavraPrima.converteEmNumero("Z");
		assertEquals(52, valor);
	}
	
	@Test
	public void test2EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(2);
		assertEquals(true, resultadoTeste);
	}
	@Test
	public void test26EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(26);
		assertEquals(false, resultadoTeste);
	}
}

