import java.util.InputMismatchException;
import java.util.Scanner;

final class Demo {
	public static void main(String[] args) {
		try {
			char ch;
			Scanner sc = new Scanner(System.in);
			Bank ob = new Bank("ICICI", "Greater Noida", "35642545684");
			Customer ob1 = new Customer();
			Employee ob2 = new Employee("Dr Sunil Chauhan", "22/08/1883", "2005", "9854769898", "raman1885@hotmail.com",
					"25145", "Manager", 65000.0);
			ob1.OpenAccount();
			ob.welcome();
			ob2.printEmpDetails();
			ob1.printCustomerDetails();
			do {
				ob.serviceAvailable();
				if (ob1.getBalance() == 0)
					break;
				System.out.print("\n\n\tDo You Wish TO Continue (Y for Yes, any other key for No) :");
				ch = sc.next().charAt(0);
			} while (ch == 'Y' || ch == 'y');
		}

		catch (InputMismatchException ex) {
			System.out.println("\n\tSorry . . !! Wrong Input.");
		} catch (Exception ex) {
			System.out.println("\n\tError : " + ex.getMessage() + " . . . !!!");
		} finally {
			System.out.println("\n\n\t\tThanks For Using Our Services . . .!!!\n\n\t\tHave A Nice Day . . .!!!");
		}
	}
}
