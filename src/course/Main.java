package course;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.00);

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
}
