package TDD;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraCDBTest {
    private CalculadoraCDB calculadora;

    @Before
    public void setup() {
        calculadora = new CalculadoraCDB();
    }

    @Test
    public void TestarCalculoRendimentoBruto() {
        calculadora.calcularRendimentoBruto(60, 1000, 8.5);
        assertEquals(13.97, calculadora.getRendimentoBruto(), 0);
    }

    @Test
    public void TestarCalculoRendimentoBruto2() {
        calculadora.calcularRendimentoBruto(120, 500, 8.0);
        assertEquals(13.15, calculadora.getRendimentoBruto(), 0);
    }

    @Test
    public void TestarCalculoRendimentoBruto3() {
        calculadora.calcularRendimentoBruto(240, 3000, 9.0);
        assertEquals(177.53, calculadora.getRendimentoBruto(), 0);
    }

    @Test
    public void testarImpostoDeRenda() {
        calculadora.calcularImpostoDeRenda(180);
        assertEquals(0.225f, calculadora.getImpostoDeRenda(), 0);
    }
}
