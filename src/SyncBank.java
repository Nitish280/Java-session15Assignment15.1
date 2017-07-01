
import java.util.Scanner;

//here we are creating a class syncbank
public class SyncBank extends Exception implements Runnable {
	String s1;
	int atmId;
	String bankName, location;
	double withdrw, c, deposit, c1, c2;

	// here we are creating run method
	public void run() {

	}

	// here we are taking sync method
	public synchronized void start() {
		start();

	}

	SyncBank(String s) {
		s1 = s;
	}

	// here we are taking method to return string in case exception occurs
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}

	// here we are defining the withdraw method
	public void withdraw() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter the amount to withdraw ");
		withdrw = s2.nextDouble();

		// here we applying TRY and CATCH to deal with exception
		try {
			// here we are applying condition if amount entered is greater than
			// balance
			if (deposit < 0)
				throw new Bank("your balance is " + deposit);

			if (deposit >= withdrw) {
				// here we are applying condition for deduction of balance
				deposit = deposit - withdrw;
				System.out.println("available balance " + deposit);
			} else
				System.out.println("insufficient balance");
		}
		// here it will catch the exception
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	// here we are creating sync deposit method
	public synchronized void deposit() {
		// here we are creating scanner for taking the input from the user
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the amount to deposit ");
		double amnt = s1.nextDouble();

		deposit = deposit + amnt;
		System.out.println("credit amount balance " + deposit);

	}
	// here we are creating main method

	public static void main(String[] args) {
		// here we are creating object of bankAtam class
		SyncBank obj = new SyncBank(" insufficient balance ");
		// here we are creating a THREAD
		Thread t1 = new Thread(obj);
		// Here we are calling the run method
		t1.start();
		obj.deposit();
		obj.withdraw();
		// here we are creating a THREAD
		Thread t2 = new Thread(obj);
		// Here we are calling the run method
		t2.start();
		obj.deposit();
		obj.withdraw();
		obj.withdraw();

	}

}
