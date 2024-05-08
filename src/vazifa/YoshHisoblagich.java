package vazifa;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class YoshHisoblagich {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tug'ilgan yilni kiriting: ");
		int yil = sc.nextInt();
		System.out.print("Tug'ilgan oyni kiriting: ");
		int oy = sc.nextInt();
		System.out.print("Tug'ilgan kunni kiriting: ");
		int kun = sc.nextInt();
		LocalDate lc = LocalDate.of(yil, oy, kun);
		LocalDate lcd = LocalDate.now();
		System.out.println("Yosh=" + agecalculate(lc, lcd));

	}

	private static Period agecalculate(LocalDate lc, LocalDate lcd) {
		Period per = Period.between(lc, lcd);
		return per;
	}
}
