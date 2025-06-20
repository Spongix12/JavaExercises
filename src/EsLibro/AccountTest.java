package EsLibro;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
         Account a1 = new Account("Jane Green",1800.32);
        Account a2 = new Account("Jane Gre",1800.3232);

        System.out.printf("%s balance : $%.2f%n",a1.getName(),a1.getBalance());
        System.out.printf("%s balance : $%.2f%n",a2.getName(),a2.getBalance());

        Scanner in =   new Scanner(System.in);


        System.out.println("Enter deposit amount for account 1 :");
        double depositAm  = in.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance %n %n",depositAm);
        a1.deposit(depositAm);

        //Mostra i saldi
        System.out.printf("%s balance : %.2f %n",a1.getName(),a1.getBalance());


    }
}
