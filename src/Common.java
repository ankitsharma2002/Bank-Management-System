
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;

abstract class Common {
	protected String name;

	Common() {
	}

	Common(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

