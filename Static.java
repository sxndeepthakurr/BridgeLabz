class BankAccount {
    // Static variable for bank name
    static String bank = "State Bank of India";

    // Static counter for total accounts
    static int count = 0;

    // Final account number
    final int accNo;

    // Account holder name
    String name;

    // Constructor
    BankAccount(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        count++;
    }

    // Static method to get total accounts
    static int getCount() {
        return count;
    }

    // Method to display account details
    void show() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bank);
            System.out.println("Name: " + name);
            System.out.println("Acc No: " + accNo);
        } else {
            System.out.println("Not a valid account.");
        }
    }
}

public class Static {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Amit");
        BankAccount a2 = new BankAccount(102, "Riya");

        a1.show();
        System.out.println("------------");
        a2.show();
        System.out.println("------------");
        System.out.println("Total Accounts: " + BankAccount.getCount());
    }
}