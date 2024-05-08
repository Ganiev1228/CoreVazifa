package vazifa;

import java.util.Arrays;

public class SonlarYigindisi {

	public static void main(String arg[]) {
		int arrlist[] = { 2, 11, 9, 34, -3, 7, 43,98 };
		System.out.println(arrSum2(arrlist));
	}

	public static int arrSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static int arrSum2(int[] arr2) {
		int str = Arrays.stream(arr2).sum();
		return str;
	}

}