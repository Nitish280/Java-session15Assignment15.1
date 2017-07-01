
import java.util.Scanner;

//here we are creating the Withdraw class
public class Withdraw extends Exception implements Runnable {
	String s1;
	int atmId;
	String bankName, location;
	double b, c, b1, deposit, withdrw, c1, c2;

	// here we are taking sync method
	public synchronized void run() {
		// here we are creating scanner for taking the input from the user

		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the amount to withdraw ");
		withdrw = s2.nextDouble();

		// TRY and CATCH to deal with exception
		try {
			// here we are applying the condition if amount entered is greater
			// than balance
			if (deposit < 0)
				throw new Bank("your balance is " + deposit);

			if (deposit >= withdrw) {
				// here we are applying condition for deduction of balance
				deposit = deposit - withdrw;
				System.out.println("available balance " + deposit);
			} else
				System.out.println("insufficient balance");
		}
		// here we are applying catch
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	Withdraw(String s) {
		s1 = s;
	}

	// here we are creating method to return string in case exception occurs
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}
}
