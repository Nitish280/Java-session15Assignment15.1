import java.util.Scanner;

//here we are creating the Deposit class
public class Deposit implements Runnable {
	String s1;
	int atmId;
	String bankName, location;
	double b, c, b1, deposit, c1 = 0, c2;
	// here we are taking sync method

	public synchronized void start() {
		start();
	}
	// here we are creating a thread

	Thread t1 = new Thread(new Runnable() {
		// here we are creating a run method

		public void run() {
			// here we are creating scanner for taking the input from the user

			Scanner s1 = new Scanner(System.in);
			System.out.println("enter the amount to deposit ");
			double amnt = s1.nextDouble();

			deposit = deposit + amnt;
			System.out.println("credit amount balance " + deposit);

		}
	});

	public static void main(String[] args) {
		// object of bankAtam class
		// here we are creating the object of deposit
		Deposit obj = new Deposit();
		// here we are creating thread
		Thread t1 = new Thread(obj);
		// here we are calling the start method

		t1.start();
		// here we are creating the object of withdraw method

		Withdraw obj1 = new Withdraw(" insufficient balance ");
		// here we are creating thread
		Thread t2 = new Thread(obj1);
		// here we are calling the start method
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
