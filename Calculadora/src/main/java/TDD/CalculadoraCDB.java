package TDD;

public class CalculadoraCDB {

    private double rendimentoBruto;
    private double impostoDeRenda;

    public void calcularRendimentoBruto(int dias, double capital, double taxaJurosAnual){
        double rendimento = capital * ((double)dias/365) * (taxaJurosAnual/100);
        this.rendimentoBruto = Math.round(rendimento * 100.0) / 100.0;
    } 

    public double getRendimentoBruto(){
        return this.rendimentoBruto;
    }

    public void calcularImpostoDeRenda(int prazo) {
        if (prazo > 0 && prazo <= 180)
            this.impostoDeRenda = 0.225f;
        else if (prazo >= 181 && prazo <= 360)
            this.impostoDeRenda = 0.200f;
        else if (prazo >= 361 && prazo <= 720)
            this.impostoDeRenda = 0.175f;
        else
            this.impostoDeRenda = 0.150f;
    }

    public double getImpostoDeRenda() {
        return this.impostoDeRenda;
    }
    
}
