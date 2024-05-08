package vazifa;

import java.util.Scanner;

public class MinMaxInArray {

	public static void main(String[] abd) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array chegarasi: ");
		int[] s = new int[sc.nextInt()];
		System.out.println("Array uchun raqamlarni kiriting: ");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
		int[] mn = minmax(s);
		System.out.println("Minimum number is: " + mn[1]);
		System.out.println("Max number is: " + mn[0]);
	}

	public static int[] minmax(int[] mnx) {
		int[] m = { Integer.MIN_VALUE, Integer.MAX_VALUE };
		for (int i : mnx) {
			if (i > m[0]) {
				m[0] = i;
			}
			if (i < m[1]) {
				m[1] = i;
			}
		}
		return m;
	}
}
