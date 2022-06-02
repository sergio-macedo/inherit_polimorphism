package entities;

public class CompanyTaxPayer extends TaxPayer {
    private Integer staff;

    public CompanyTaxPayer() {
        super();
    }

    public CompanyTaxPayer(String name, double annualIncome, Integer staff) {
        super(name, annualIncome);
        this.staff = staff;
    }

    public Integer getStaff() {
        return staff;
    }

    public void setStaff(Integer staff) {
        this.staff = staff;
    }

    public double taxPayment() {
        double tax = 0;
        if (staff < 10) {
            tax = getAnnualIncome() * 0.16;
        }
        if (staff > 10) {
            tax = getAnnualIncome() * 0.14;
        }
        return tax;
    }
}
