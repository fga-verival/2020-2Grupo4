package TDD;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraCDBTest {
    private CalculadoraCDB calculator;

    @Before
    public void setup() {
        calculator = new CalculadoraCDB();
    }

    @Test
    public void TestGrossIncomeCalculation() {
        int days = 60;
        double capital = 1000;
        double annualInterestRate = 8.5;
        calculator.calculateGrossIncome(days, capital, annualInterestRate);
        assertEquals(13.97, calculator.getGrossIncome(), 0);
    }

    @Test
    public void TestGrossIncomeCalculation2() {
        int days = 120;
        double capital = 500;
        double annualInterestRate = 8.0;
        calculator.calculateGrossIncome(days, capital, annualInterestRate);
        assertEquals(13.15, calculator.getGrossIncome(), 0);
    }

    @Test
    public void TestGrossIncomeCalculation3() {
        int days = 240;
        double capital = 3000;
        double annualInterestRate = 9.0;
        calculator.calculateGrossIncome(days, capital, annualInterestRate);
        assertEquals(177.53, calculator.getGrossIncome(), 0);
    }

    @Test
    public void testIncomeTax() {
        calculator.calculateIncomeTax(180);
        assertEquals(0.225f, calculator.getIncomeTax(), 0);
    }

    @Test
    public void testIncomeTax2() {
        calculator.calculateIncomeTax(240);
        assertEquals(0.20f, calculator.getIncomeTax(), 0);
    }

    @Test
    public void testIncomeTax3() {
        calculator.calculateIncomeTax(700);
        calculator.calculateIncomeTax(800);
        assertEquals(0.15f, calculator.getIncomeTax(), 0);
    }

    @Test
    public void testarRendimentoLiquido(){
        calculadora.calcularRendimentoBruto(60, 1000, 8.5);
        calculadora.calcularImpostoDeRenda(60);

        calculadora.calcularRendimentoLiquido(1000, 
            calculadora.getRendimentoBruto(),
            calculadora.getImpostoDeRenda());
        assertEquals(1.0829, calculadora.getRendimentoLiquido(), 0.001);
    }

    @Test
    public void testarRendimentoLiquido2(){
        calculadora.calcularRendimentoBruto(550, 400, 8.0);
        calculadora.calcularImpostoDeRenda(550);
        
        calculadora.calcularRendimentoLiquido(400, 
            calculadora.getRendimentoBruto(),
            calculadora.getImpostoDeRenda());
        assertEquals(9.9452, calculadora.getRendimentoLiquido(), 0.001);
    }

    @Test
    public void testarRendimentoLiquido3(){
        calculadora.calcularRendimentoBruto(240, 3000, 9.0);
        calculadora.calcularImpostoDeRenda(240);
        
        calculadora.calcularRendimentoLiquido(3000, 
            calculadora.getRendimentoBruto(),
            calculadora.getImpostoDeRenda());
        assertEquals(4.7342, calculadora.getRendimentoLiquido(), 0.001);
    }
}
