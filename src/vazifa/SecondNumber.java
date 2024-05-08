package vazifa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondNumber {
	public static void main(String args[]) {
		Integer arr[] = { 1, 1, 9, 3, 6, 8, 9, 12, 10, 11, 12,10,12 };
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max2 = max;
				max = i;
			} else if (max2 < i && i < max) {
				max2 = i;
			}
		}
		System.out.println("Eng katta son: " + max);
		System.out.print("Eng katta ikkinchi son: " + max2);

	}
}
//     Integer arr[] = { 1,1, 9, 3, 6, 8, 9,12,10,11,12 };
//     List<Integer> arr1 = Arrays.asList(arr);
//     int secversion=  arr1.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//     int secversionmin=  arr1.stream().sorted().distinct().skip(1).findFirst().get();
//     System.out.println(secversion);
//     System.out.print(secversionmin);
