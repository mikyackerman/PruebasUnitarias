package programas;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {
	
	@Test
	public void testFibonacci() {
		System.out.println("Serie Fibonacci");
		Operaciones testFibonacci = new Operaciones();
		int resultado = testFibonacci.fibonacci(-1);
		assertEquals(55,resultado);
	}
	
	@Test
	public void testPrimo() {
		
		Operaciones testPrimo = new Operaciones();
		boolean resultado = testPrimo.primo(7);
		assertEquals(false,resultado);
		
	}
	
	@Test
	public void sumaNumeros() {
		
		Operaciones testSuma = new Operaciones();
		int resultado = testSuma.sumaNumeros(6);
		assertEquals(3,resultado);
		
	}
	
	@Test
	public void formulaGeneralX1() {
		double est=7.0;
		Operaciones testGeneral = new Operaciones();
		double resultado = testGeneral.formulaGeneral(1,-3,2);
		assertEquals(est,resultado,5.0);
		
	}
	
	@Test
	public void formulaGeneralX2() {
		double est=4.0;
		Operaciones testGeneral = new Operaciones();
		double resultado = testGeneral.formulaGeneralX2(1,-3,2);
		assertEquals(est,resultado,3.0);
		
	}
	

}
