package Problem3;

public class Main {
    public static void main(String[] args) {


        // Declare double variables for initial balance, deposit amount, and withdrawal amount
        double ibal, damt, wamt;


        ibal = 1000.00;

        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);

        System.out.println("Savings A/c: Initial Balace: $" + ibal);


        damt = 500.00;

        savingsAccount.deposit(damt);


        wamt = 250.00;

        savingsAccount.withdraw(wamt);


        wamt = 1600.00;

        System.out.println("\nTry to withdraw: $" + wamt);

        savingsAccount.withdraw(wamt);


        System.out.println();

        // Set initial balance for CurrentAccount
        ibal = 5000.00;
        // Create a new CurrentAccount object with the initial balance
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
        // Print initial balance of CurrentAccount
        System.out.println("Current A/c: Initial Balace: $" + ibal);

        // Set deposit amount for CurrentAccount
        damt = 2500.00;
        // Deposit amount into CurrentAccount
        currentAccount.deposit(1000.0);

        // Set first withdrawal amount for CurrentAccount
        wamt = 1250.00;
        // Withdraw amount from CurrentAccount
        currentAccount.withdraw(3000.0);

        // Set second withdrawal amount for CurrentAccount
        wamt = 6000.00;
        // Print attempt to withdraw larger amount from CurrentAccount
        System.out.println("\nTry to withdraw: $" + wamt);
        // Attempt to withdraw larger amount from CurrentAccount
        savingsAccount.withdraw(wamt);


    }

}
