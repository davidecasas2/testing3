package funciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UtilidadesTest {

	private static Utilidades utilidades;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		utilidades = new Utilidades();
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Antes de cada test");
	}

	@Test
	void devuelveNotaTest() {
		assertEquals("Suspenso", utilidades.devuelveNota(4));
		assertEquals("Bien", utilidades.devuelveNota(5.5));
		assertEquals("Notable", utilidades.devuelveNota(7));
		assertEquals("Sobresaliente", utilidades.devuelveNota(9));
		assertEquals("Matrícula", utilidades.devuelveNota(10));
		assertThrows(ArithmeticException.class, ()->utilidades.devuelveNota(12));
		assertThrows(ArithmeticException.class, ()->utilidades.devuelveNota(-4));	
	}
	
	@Test
	void calcularSalarioTest() {
		assertEquals(200,utilidades.calculaSalario(20,10,9));
		assertEquals(404,utilidades.calculaSalario(40,10,12));
	}
	
	@Test
	void cuentaDivisoresTest() {
		assertEquals(2, utilidades.cuentaDivisores(3));
		assertEquals(4, utilidades.cuentaDivisores(8));
		assertEquals(0, utilidades.cuentaDivisores(0));
	}
	
	@Test
	void devuelveMenorTest() {
		int v[] = {5,1,7,9,2};
		int v2[] = {5,1,7,-9,2};
		int v3[] = {5,-9,7,-9,2};
		assertEquals(1, utilidades.devuelveMenor(v));
		assertEquals(-9, utilidades.devuelveMenor(v2));
		assertEquals(-9, utilidades.devuelveMenor(v3));

	}
	
	@Test
	void burbujaTest() {
		int v[] = {8, 5 ,1 , 9, 4};
		int v2[] = {8, 5 ,1 , 5, 4};
		int ordenado[] = {1, 4, 5, 8, 9};
		int ordenado2[] = {1, 4, 5, 5, 8};
		
		assertArrayEquals(ordenado, utilidades.burbuja(v));
		System.out.println(Arrays.toString(v2));
		assertArrayEquals(ordenado2, utilidades.burbuja(v2));
	}

}
