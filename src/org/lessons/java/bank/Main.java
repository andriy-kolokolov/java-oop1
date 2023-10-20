package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userSelect;
        boolean userInBank;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating bank account. Insert your name :");
        Bank bank = new Bank();
        bank.setAccountName(scanner.nextLine());


        System.out.println("Welcome in our bank, " + bank.getAccountName());
        userInBank = true;
        while (userInBank) {
            System.out.println("\n Select operation:");
            System.out.print("""
                    1: Balance Info.
                    2: Account Info.
                    3: Top Up Balance.
                    4: Withdraw from account.
                    0: Exit.
                    >>>
                    """);
            userSelect = scanner.nextInt();

            switch (userSelect) {
                case 1: {
                    System.out.printf("Your balance amount: %.2f", bank.getBalance());
                    break;
                }
                case 2: {
                    System.out.println(bank + "\n");
                    break;
                }
                case 3: {
                    System.out.println("Insert amount: ");
                    bank.topUpBalance(scanner.nextDouble());
                    System.out.printf("Now your balance is: %.2f", bank.getBalance());
                    break;
                }
                case 4: {
                    System.out.println("Insert how much do you want to withdraw: ");
                    bank.withdrawFromAccount(scanner.nextDouble());
                    break;
                }
                case 0: {
                    userInBank = false;
                    break;
                }
                default: {
                    System.err.println("Operation '" + userSelect + "' not found..");
                }
            }
        }
        System.out.println("Heave a nice day!");
        scanner.close();
    }
}
