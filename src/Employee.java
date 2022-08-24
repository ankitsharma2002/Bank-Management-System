import java.util.Scanner;

class Employee extends Common2 {
	private String yearOfJoining, empId, designation;
	private double salary;

	Employee() {
	}

	Employee(String name, String dob, String yearOfJoining, String email, String mobileNo, String empId,String designation, double salary) {
		super(name, dob, email, mobileNo);
		this.yearOfJoining = yearOfJoining;
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}

	String getYearOfJoining() {
		return yearOfJoining;
	}

	String getEmpId() {
		return empId;
	}

	String getDesignation() {
		return designation;
	}

	double getSalary() {
		return salary;
	}

	void printEmpDetails() {
		System.out.println("_______________________________________________________________________________\n");
		System.out.println("\t\t\t*** EMPLOYEE DETAILS : ***\n\n");
		System.out.printf("\tNAME : %s\t\tDATE OF BIRTH :%s\t\tYEAR OF JOINING : %s\n\n", super.getName(),
				super.getDob(), getYearOfJoining());
		System.out.printf("\tEMPLOYEE ID : %s\t\tE-MAIL : %s\t\t MOBILE NO. : %s\n\n", super.getEmail(),
				super.getEmail(), super.getMobileNo());
		System.out.printf("\tDESIGNATION : %s\t\tSALARY : %.2f\n\n", getDesignation(), getSalary());
		System.out.println("_____________________________________________________________________\n");
	}

	static void passLoan(double amount, double rate) {
		Scanner sc = new Scanner(System.in);
		double i, a;
		System.out.print("\tEnter Time Period (in years) : ");
		byte t = sc.nextByte();
		i = (amount * rate * t) / 100;
		a = amount + i;
		System.out.println("\n\tLoan Amount : " + amount);
		System.out.println("\tInterest Rate : " + rate + "%");
		System.out.println("\tTime Period : " + t + " Years");
		System.out.println("\tInterest Generated : " + i);
		System.out.println("\tTotal Amount To Be Paid : " + a);
		System.out.print("\tEnter Y To Confirm (any other key to cancel the process) : ");

		char ch = sc.next().charAt(0);
		if (ch == 'Y' || ch == 'y')
			System.out.print("\n\n\tCongratulations ...!!! \n\t Your Loan Has Been Passed...\n");
		else
			System.out.print("\n\n\tSorry ..!! \n\t Your Loan Could Not Be Passed...\n");
	}
}
