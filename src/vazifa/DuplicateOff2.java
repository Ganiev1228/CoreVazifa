package vazifa;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateOff2 {

	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Massiv chegarasini kiriting: ");
		int size = sc.nextInt();
		int [] nums = new int[size];
		for (int i=0;i<size;i++) {
			nums[i]= sc.nextInt();
		}
		System.out.print(duplicoff(nums));
	}
	public static Set<Integer> duplicoff(int []arr) {
		Set<Integer> list = new LinkedHashSet<>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		return list;
	}
}
