package course;

import entities.CompanyTaxPayer;
import entities.IndividualTaxPayer;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxPayerProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Is it individual or company? ");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Type the name ");
            String name = sc.nextLine();
            System.out.println("Type the annual income ");
            double annualIncome = sc.nextDouble();
            if (c == 'i') {
                System.out.println("Type the health expenditures");
                double healthExpenses = sc.nextDouble();
                TaxPayer individualTaxPayer = new IndividualTaxPayer(name, annualIncome, healthExpenses);
                list.add(individualTaxPayer);
            } else {
                System.out.println("Type the number of employees");
                int staff = sc.nextInt();
                TaxPayer companyTaxPayer = new CompanyTaxPayer(name, annualIncome, staff);
                list.add(companyTaxPayer);
            }
        }
        System.out.println("");
        System.out.println("TAXES PAID");
        double total = 0;
        for (TaxPayer payer : list) {
            total += payer.taxPayment();
            System.out.println(payer.taxPayment());
        }

        System.out.println();
        System.out.println("TOTAL TAXES");
        System.out.println(total);


        sc.close();
    }
}
