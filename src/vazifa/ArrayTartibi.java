package vazifa;

import java.util.Scanner;

public class ArrayTartibi {

	public static void main (String argo[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Massiv chegarasini kiriting: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Massive elementlarini kiriting: ");
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Kiritilgan massiv raqamlari: ");
		for (int all : arr) {
			System.out.print(all+",");
		}
		System.out.println(increase(arr));
		sc.close();
	}
	public static boolean increase (int bln[]) {
		for (int i=0; i<bln.length-1;i++) {
			if (bln[i]>bln[i+1]) {
				return false;
			}
		}return true;
	}
}
