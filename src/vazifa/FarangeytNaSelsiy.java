package vazifa;

import java.util.Scanner;

public class FarangeytNaSelsiy {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		 while (true) {
		System.out.println("Farangeyt darajasini kiriting: ");
		int fahreinheit = sc.nextInt();
		System.out.println(fahrenheitToCelsius(fahreinheit));
		 }
	}

	private static int fahrenheitToCelsius(int f) {
		return (f-32)*5/9;
	}
}
