package Atm;

import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {

        float balance = 100000,withdraw,deposit;
        String name;
        String userName;
        String password;
        String accountNo;
     Scanner sc = new Scanner(System.in);

     while (true){

         System.out.println("______||Welcome to Simplified Learner ATM||______");
         System.out.println("Choose 1 for Withdraw  ");
         System.out.println("Choose 2 for Deposit ");
         System.out.println("Choose 3 for Check Balance  ");
         System.out.println("Choose 4 for Exit  ");
         System.out.print("Choose the operation you want to performance:  ");

         int choice  = sc.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Enter money to be Withdraw:");
                 withdraw = sc.nextInt();

                 if (balance >= withdraw) {

                     balance = balance - withdraw;
                     System.out.println("Please Collect your money.");
                 } else {
                     System.out.println("Insufficient Balance");
                 }
                 System.out.println("");
                 break;

             case 2:
                 System.out.println("Enter money to be deposited:");
                 deposit = sc.nextInt();

                 balance = balance + deposit;
                 System.out.println("Your Money has been successfully");
                 System.out.println("");
                 break;

             case 3:
                 System.out.println("Balance: " + balance);
                 System.out.println("");
                 break;

             case 4:
                 System.exit(0);

         }
     }

    }
}
