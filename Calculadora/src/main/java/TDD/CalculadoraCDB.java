package TDD;

public class CalculadoraCDB {

    private double grossIncome;
    private double incomeTax;
    private double rendimentoLiquido;

    public void calculateGrossIncome(int days, double capital, double annualInterestRate){
        int yearDays = 365;
        double income = capital * ((double)days/yearDays) * (annualInterestRate/100);
        this.grossIncome = Math.round(income * 100.0) / 100.0;
    } 

    public double getGrossIncome(){
        return this.grossIncome;
    }

    public void calculateIncomeTax(int term) {
        int semesterDays = 180;

        if (term > 0 && term <= semesterDays)
            this.incomeTax = 0.225f;
        else if (term > semesterDays && term <= semesterDays * 2)
            this.incomeTax = 0.200f;
        else if (term > semesterDays && term <= semesterDays * 3)
            this.incomeTax = 0.175f;
        else
            this.incomeTax = 0.150f;
    }

    public double getIncomeTax() {
        return this.incomeTax;
    }

    public void calcularRendimentoLiquido(
        double capital,
        double rendimentoBruto,
        double impostoDeRenda){
        double liquido = rendimentoBruto - (rendimentoBruto*impostoDeRenda);
        this.rendimentoLiquido = (liquido*100)/capital;
    }

    public double getRendimentoLiquido(){
        return this.rendimentoLiquido;
    }
    
}
