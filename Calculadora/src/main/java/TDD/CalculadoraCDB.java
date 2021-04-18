package TDD;

public class CalculadoraCDB {

    private double rendimentoBruto;

    public void calcularRendimentoBruto(int dias, double capital, double taxaJurosAnual){
        double rendimento = capital * ((double)dias/365) * (taxaJurosAnual/100);
        this.rendimentoBruto = Math.round(rendimento * 100.0) / 100.0;
    } 

    public double getRendimentoBruto(){
        return this.rendimentoBruto;
    }
    
}
