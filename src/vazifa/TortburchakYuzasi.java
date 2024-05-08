package vazifa;

import java.util.Scanner;

public class TortburchakYuzasi {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Maydon uzunligini kiriting: ");
		int length = sc.nextInt();
		System.out.println("Maydon kengligini kiriting: ");
		int width = sc.nextInt();
		System.out.println("Maydon yuzasi=" + length * width);
	}

}
