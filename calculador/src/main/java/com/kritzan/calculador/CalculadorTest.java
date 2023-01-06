package com.kritzan.calculador;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
class CalculatorTest {
    private Calculador calculador = new Calculador();
    @Test
    public void testSum() {
        assertEquals(5, calculador.sum(2, 3));
    }
}

