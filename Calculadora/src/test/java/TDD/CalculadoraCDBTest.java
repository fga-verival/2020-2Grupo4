package TDD;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraCDBTest {
    private CalculadoraCDB calculadora;

    @Before
    public void setup(){
        calculadora = new CalculadoraCDB();
    }

    @Test
    public void TestarCalculoRendimentoBruto(){
        calculadora.calcularRendimentoBruto(60, 1000, 8.5);
        assertEquals(13.97, calculadora.getRendimentoBruto(), 0);
    }
    
}
