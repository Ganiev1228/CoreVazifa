package vazifa;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateOff {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Massiv chegarasani kiriting: ");
		int numbers = sc.nextInt();
		Integer[] dd = new Integer[numbers];
		System.out.print("Massiv sonlarini kiriting: ");
		for (int i = 0; i < numbers; i++) {
			dd[i] = sc.nextInt();
		}
		Integer[] res = delduplics(dd);
		System.out.println(Arrays.toString(res));
	}
	public static Integer[] delduplics(Integer[] numbers) {
		return Arrays.stream(numbers).sorted().distinct().toArray(Integer[]::new);
	}
}
