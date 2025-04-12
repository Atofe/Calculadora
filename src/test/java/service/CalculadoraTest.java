package service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private Operaciones operaciones;
    private final double op = 0.0001;

    @Before
    public void setUp() {
        operaciones = new Operaciones();
    }

    @Test
    public void testSuma() {
        assertEquals(15.0, operaciones.suma(10, 5), op);
        assertEquals(0.0, operaciones.suma(-5, 5), op);
        assertEquals(2.5, operaciones.suma(1.25, 1.25), op);
    }

    @Test
    public void testResta() {
        assertEquals(5.0, operaciones.resta(10, 5), op);
        assertEquals(-10.0, operaciones.resta(5, 15), op);
        assertEquals(0.5, operaciones.resta(1.25, 0.75), op);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(50.0, operaciones.multiplicacion(10, 5), op);
        assertEquals(-25.0, operaciones.multiplicacion(5, -5), op);
        assertEquals(0.9375, operaciones.multiplicacion(1.25, 0.75), op);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, operaciones.division(10, 5), op);
        assertEquals(1.6667, operaciones.division(5, 3), op);
        assertEquals(2.5, operaciones.division(1.25, 0.5), op);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        operaciones.division(10, 0);
    }

    @Test
    public void testUsarCalculadora() {
        Calculadora.usarCalculadora();
    }
}