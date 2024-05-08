package vazifa;

import java.util.Scanner;

public class PasswordCreater2 {
	public static boolean valid(String pass) {

		if (pass.length() < 3) {
			return false;
		}
		if (!pass.matches("(.*[a-z])||(.*[а-я])")) {
			return false;
		}
		if (pass.matches(".*\\s.*")) {
			return false;
		}
		return true;
	}

	public static void main(String ar[]) {
		Scanner nw = new Scanner(System.in);
		while (true) {
			System.out.println("Придумайте пароль:\n Правила [a-z],[а-я] и без пробелов");
			String dd = nw.nextLine();
			if (valid(dd) == true) {
				System.out.println("Пароль создана!");
				nw.close();
				break;
			} else {
				System.out.println("Пароль не содержит нужные символов!");
			}
		}
	}
}
