package Com.Banking;

import java.util.Scanner;

public class Banking {

	private String CustomerName;
	private String accountNumber;
	private double accountBalance;

	public Banking(String name, String accountnum, double balance) {
		CustomerName = name;
		accountNumber = accountnum;
		accountBalance = balance;
	}

	public void Credit(double amount) {
		accountBalance += amount;

	}

	public void Debit(double amount) {
		accountBalance -= amount;
	}

	public void DisplayAccountDetails() {
		System.out.println("Account Details:");
		System.out.println("Customername :" + CustomerName);
		System.out.println("AccountNumber:" + accountNumber);
		System.out.println("Account Balance:" + accountBalance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create new bank object

		Banking account = new Banking("Ayush Dabhade", " 74387758321", 100000.0);

		// Display initial account details

		account.DisplayAccountDetails();

		// perform credit and debit transaction

		System.out.println("Enter amount credit");

		double creditAmount = sc.nextDouble();

		account.Credit(creditAmount);
		System.out.println("Enter the amount to debit");

		double debitAmount = sc.nextDouble();
		account.Debit(debitAmount);

		// Display update account details

		account.DisplayAccountDetails();

	}
}
