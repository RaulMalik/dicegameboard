package main;

public class konto {
    private int balance = 1000;  

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;  
        }
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money ensuring balance does not go negative
    public boolean withdraw(int amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrew: " + amount + ". New balance: " + balance);
                return true;  
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
                return false;  
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;  
        }
    }
}

/*
By moving the balance management into a separate konto class and integrating it within the spiller class,
we've encapsulated the player's financial details away from any game-specific logic.
This design allows the spiller class to be reused across different games, as it now interacts with a generic konto for balance operations.
The spiller class provides a consistent interface (getPlayerBalance() and setPlayerBalance()) for accessing and modifying the player's balance,
making it easy to integrate into other games without modification. By separating concerns, we enhance modularity and reusability,
fulfilling the requirement of using the player and their balance in other games.
This approach ensures that both spiller and konto remain generic and adaptable for various gaming scenarios.
 */