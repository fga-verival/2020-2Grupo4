package TDD;

public class CalculadoraCDB {

    private double grossIncome;
    private double incomeTax;

    public void calculateGrossIncome(int days, double capital, double annualInterestRate){
        double income = capital * ((double)days/365) * (annualInterestRate/100);
        this.grossIncome = Math.round(income * 100.0) / 100.0;
    } 

    public double getGrossIncome(){
        return this.grossIncome;
    }

    public void calculateIncomeTax(int term) {
        int semester_days = 180;

        if (term > 0 && term <= semester_days)
            this.incomeTax = 0.225f;
        else if (term > semester_days && term <= semester_days * 2)
            this.incomeTax = 0.200f;
        else if (term > semester_days && term <= semester_days * 3)
            this.incomeTax = 0.175f;
        else
            this.incomeTax = 0.150f;
    }

    public double getIncomeTax() {
        return this.incomeTax;
    }
    
}
