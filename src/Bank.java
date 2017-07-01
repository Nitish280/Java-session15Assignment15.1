
/*
 * here we are creating a program for the online banking application
 * 
 */
import java.util.Scanner;

//here we are creating a class bank
public class Bank extends Exception implements Runnable {
	// here we are taking some different data types
	// for perform the operations
	String s1;
	int atmId;
	String bankName, location;
	double b, c, b1, deposit, c1, c2;

	public void run() {

	}

	Bank(String s) {
		s1 = s;
	}

	// here we are taking method to return string in case exception occurs
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}

	// here we are creating withdraw method
	public void withdraw() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the amount to withdraw ");
		b = s2.nextDouble();

		// here we are applying TRY and CATCH to deal with exception
		try {
			// here we are applying condition if amount entered is greater than
			// balance
			if (b1 < 0 || b1 < b)
				throw new Bank("your balance is " + b1);

			b1 = b1 - b;

			if (b1 > 0) {
				// here we applying condition for deduction of balance
				// b1 = b1-b;
				System.out.println("available balance " + b1);
				c = b1;
			} else
				System.out.println("insufficient balance");
		}
		// here it will catch exception
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	// here we are creating a deposit method
	public void deposit() {
		// here we are using scanner for taking the input from the user
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the amount to deposit ");
		b1 = s1.nextDouble();

		b1 = b1 + c;
		System.out.println("credit amount balance " + b1);

	}

	public static void main(String[] args) {
		// here we are creating object of bank class
		Bank obj = new Bank(" insufficient balance ");
		// here we are creating a THREAD
		Thread t1 = new Thread(obj);
		// Here we are calling the run method
		t1.start();
		obj.deposit();
		obj.withdraw();

		// here we are creating a another thread

		Thread t2 = new Thread(obj);
		// here we are calling the run method
		t2.start();
		obj.deposit();
		obj.withdraw();
		obj.withdraw();

	}

}
