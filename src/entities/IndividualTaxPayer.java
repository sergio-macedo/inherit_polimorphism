package entities;

public class IndividualTaxPayer extends TaxPayer {
    private double healthExpenses;


    public IndividualTaxPayer() {
        super();
    }

    public IndividualTaxPayer(String name, double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public double taxPayment() {
        double tax = 0;
        if (getAnnualIncome() < 20000.00) {
            tax = getAnnualIncome() * 0.15 - (getHealthExpenses() * 0.5);
        }
        if (getAnnualIncome() > 20000.00) {
            tax = getAnnualIncome() * 0.25 - (getHealthExpenses() * 0.5);
        }
        return tax;
    }
}

