import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Customer extends Common2 {
	private static double openAmount, balance;
	private static String PanNo;
	private static int acno;
	private static double dep = 0.0, wit = 0.0;

	Customer() {
	}

	Customer(String name, String dob, String mobileNo, String email, String PanNo, int acno, double balance,
			double openAmount) {
		super(name, dob, mobileNo, email);
		this.PanNo = PanNo;
		this.acno = acno;
		this.openAmount = openAmount;
		this.balance = balance;
	}

	static double getOpenAmount() {
		return openAmount;
	}

	String getPanNO() {
		return PanNo;
	}

	int getAcno() {
		return acno;
	}

	static double getBalance() {
		return balance;
	}

	void OpenAccount() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\tHey There. . . !!! \n\tLets Begin With Opening Your Bank Account..\n\n");
		System.out.print("\tEnter Your Name : ");
		super.name = sc.nextLine();
		System.out.print("\n\tEnter Date Of Birth (DD/MM/YYYY) : ");
		super.dob = sc.next();
		if ((super.dob).length() != 10 || super.dob.charAt(2) != '/' || super.dob.charAt(5) != '/')
			throw new Exception("\n\tSorry..!! Invalid Date Of Birth");
		System.out.print("\n\tEnter Mobile Number : ");
		super.mobileNo = sc.next();
		for (int i = 0; i < super.mobileNo.length(); i++) {
			if (mobileNo.charAt(i) < '0' || mobileNo.charAt(i) > '9')
				throw new Exception("\n\tSorry..!! Not A Valid Mobile Number");
		}
		System.out.print("\n\tEnter E-mail Address : ");
		super.email = sc.next();
		System.out.print("\n\tEnter Pan Card Number : ");
		PanNo = sc.next();
		System.out.print("\n\tEnter Opening Amount (not less than Rs,500) : ");
		openAmount = sc.nextDouble();

		if (openAmount < 500)
			throw new Exception("\n\tSorry..!! Amount Can Not Be Less Than Rs. 500");
		System.out.print("\n\tGENERATING ACCOUNT NUMBER ");
		acno = (int) (Math.random() * 89461371);
		for (byte i = 1; i <= 5; i++) {
			TimeUnit.SECONDS.sleep(1);
			System.out.print(". ");
		}
		System.out.print("\n\n\tACCOUNT NUMBER GENERATED . . . .\n\n");
		TimeUnit.SECONDS.sleep(2);
		balance = openAmount;
	}

	static void withdraw(double amount) throws Exception {
		if (amount > getBalance())
			throw new Exception("\n\tSorry . .!! Low Balance..!! Unable To Withdraw..");
		if ((getBalance() - amount) < 500)
			throw new Exception("\n\tSorry . .!! Current Balance Can Not Be Less Than 500 . .!! Couldn't Withdraw");
		wit += amount;
		balance -= amount;
		System.out.println("\tRs. " + amount + " Withdrawn");
		System.out.println("\tCurrent Balance : Rs. " + getBalance());
	}

	static void deposite(double amount) throws Exception {
		dep += amount;
		balance += amount;
		System.out.println("\tRs. " + amount + " Deposited");

		System.out.println("\tCurrent Balance : Rs. " + getBalance());
	}

	static void closeAccount() throws Exception {
		new Customer("", "", "", "", "", 0, 0.0, 0.0);
		System.out.println("\n\t\t**** ACCOUNT CLOSED ****");
	}

	static void transactionHistory() throws Exception {
		System.out.println("\t**** TRANSACTION HISTORY ****\n");
		System.out.println("\tOpeninng Amount : " + getOpenAmount());
		System.out.println("\tTotal Amount Deposited : " + dep);
		System.out.println("\tTotal Amount Withdrawn : " + wit);
		System.out.println("\tCurrent Balance : " + getBalance());
	}

void printCustomerDetails() throws Exception { 
								 System.out.println("_______________________________________________________________________________\n"); 
								 System.out.println("\t\t\t*** CUSTOMER DETAILS : ***\n\n"); 
								 System.out.printf("\tNAME : %s\t\tDATE OF BIRTH : %s\t\tPAN NO. : %s\n\n", super.getName(), super.getDob(),getPanNO()); 
								 System.out.printf("\tACCOUNT NO . : %s\t\tOPENING AMOUNT : %s\n\n", getAcno(), getOpenAmount());
								 System.out.printf("\tMOBILE NO. : %s\t\tE-MAIL : %s\n\n",super.getMobileNo(), super.getEmail()); 
								 System.out.println("__________________________________________________________________________________________________\n"); 
}
}