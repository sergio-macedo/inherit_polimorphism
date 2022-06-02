package course;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002,"Maria",1000.0,400.0));
        list.add(new SavingsAccount(1003, "bob", 300.0, 0.01 ));
        list.add(new BusinessAccount(1004,"Ana",500.0,500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.println("Total balance" + sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("update balance %d: %.2f%n ",acc.getNumber(), acc.getBalance());
        }


        /*
        //UPCASTING
        //totally normal to make a object from the "original" class receive the info from the extended class"
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana",0.0,0.01);

        //DOWNCASTING

        BusinessAccount bacc1 = (BusinessAccount) acc2;
        bacc1.loan(100);

        //BusinessAccount bacc2 = (BusinessAccount) acc3; produces a cast error.

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount bacc2 = (BusinessAccount) acc3;
            bacc2.loan(200);
            System.out.println("loan");
        }
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount bacc2 = (SavingsAccount)acc3;
            bacc2.updateBalance();
            System.out.println("update");
        }
        Account acc6 = new Account(1,"Maria",1000.00);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());
        Account acc7 = new SavingsAccount(2,"Alex",1000.00,0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(3,"bob",1000.0,500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }

         */
    }
}