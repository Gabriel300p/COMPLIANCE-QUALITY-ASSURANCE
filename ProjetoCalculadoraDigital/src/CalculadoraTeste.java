import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {
	
	
	// Testes de Somar
	@Test
	public void testSomar5com5() {
		int variavel = 5;
		int variavel2 = 5;
		int valorRetornoEsperado = 10;
		Calculadora calc = new Calculadora();
		int valorResultadoReal = calc.somar(variavel, variavel2);
		assertEquals(valorRetornoEsperado, valorResultadoReal);
	}
	

	@Test
	public void testSomar5com6() {
		int variavel = 5;
		int variavel2 = 6;
		int valorRetornoEsperado = 11;
		Calculadora calc = new Calculadora();
		int valorResultadoReal = calc.somar(variavel, variavel2);
		assertEquals(valorRetornoEsperado, valorResultadoReal);
	}
	
	// Teste de Multiplicação	
	@Test
	public void testMultiplicar2com3() {
		int variavel = 2;
		int variavel2 = 3;
		int valorRetornoEsperado = 6;
		Calculadora calc = new Calculadora();
		int valorResultadoReal = calc.multiplicar(variavel, variavel2);
		assertEquals(valorRetornoEsperado, valorResultadoReal);
	}
	
	// Teste de Subtração	
	@Test
	public void testSubtrair2de5() {
		int variavel = 5;
		int variavel2 = 2;
		int valorRetornoEsperado = 3;
		Calculadora calc = new Calculadora();
		int valorResultadoReal = calc.subtrair(variavel, variavel2);
		assertEquals(valorRetornoEsperado, valorResultadoReal);
	}
	
	// Teste de Divisao	
	@Test
	public void testDivisao10de2() {
		int variavel = 10;
		int variavel2 = 2;
		int valorRetornoEsperado = 5;
		Calculadora calc = new Calculadora();
		int valorResultadoReal = calc.dividir(variavel, variavel2);
		assertEquals(valorRetornoEsperado, valorResultadoReal);
	}

}