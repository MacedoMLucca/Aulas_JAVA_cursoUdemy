package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountExecption;

public class Program177 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.println("Number:");
		int number = sc.nextInt();
		System.out.println("Holder:");
		String holder = sc.next();
		System.out.println("Initial Balance:");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit:");
		double WithdrawLimit = sc.nextDouble();

		Account ac = new Account(number, holder, balance, WithdrawLimit);

		System.out.println();
		System.out.println("Enter amount for withdraw:");
		double amount = sc.nextDouble();

		try {
			ac.withdraw(amount);
			System.out.printf("New Balance: %.2f%n" + ac.getBalance());
		} catch (AccountExecption e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
