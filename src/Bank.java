import java.util.InputMismatchException;
import java.util.Scanner;

class Bank extends Common {
	private String branch, ifsc;
	private double amount;
	final double rate = 8;

	Bank(String name, String branch, String ifsc) {
		super(name);
		this.branch = branch;
		this.ifsc = ifsc;
	}

	String getBranch() {
		return branch;
	}

	String getIfsc() {
		return ifsc;
	}

	void welcome() {
		System.out.printf("\n\t\t\t **** WELCOME TO %s BANK ****\n\n\n", super.getName());
		System.out.printf("\t\tBRANCH : %s\t\t\tIFSC CODE : %s\n\n", getBranch(), getIfsc());
	}

	void serviceAvailable() throws Exception {
		byte ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\t\t Services Available :-\n");
		System.out.println(
"\t\t1. Check Balance\n\t\t2. Deposite\n\t\t3. Withdraw\n\t\t4. Transaction History\n\t\t5. Take A Loan\n\t\t 6. Close Your Account");
		System.out.print("\n\tEnter Your Choice (1-6) : ");
		ch = sc.nextByte();
		switch (ch) {
		case 1:
			System.out.println("\tYour Current Balance Is : Rs. " + Customer.getBalance());
			break;
		case 2:
			System.out.print("\tEnter The Amount To Be Deposited : ");
			amount = sc.nextDouble();
			Customer.deposite(amount);
			break;
		case 3:
			System.out.print("\tEnter The Amount To Be Withdrawn : ");
			amount = sc.nextDouble();
			Customer.withdraw(amount);
			break;
		case 4:
			Customer.transactionHistory();
			break;
		case 5:
			System.out.print("\tEnter The Amount Of Loan : ");
			amount = sc.nextDouble();
			Employee.passLoan(amount, rate);
			break;

		case 6:
			Customer.closeAccount();
			break;
		default:
			System.out.println("\tINVALIID CHOICE !!! ");
		}
	}
}