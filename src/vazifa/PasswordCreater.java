package vazifa;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCreater {

	public static String shablon = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*=+])(?=\\S+$).{7,}$";

	public static boolean valid(String str) {
//		Pattern pattern = Pattern.compile(shablon);
//		Matcher matcher = pattern.matcher(str);
		return str.matches(shablon);
	}

	public static void main(String ar[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				System.out.println("[Rules: [A-Z],[a-z],[0-9],[specific icons],min 7 characters;\nEnter password: ");
				String s = sc.nextLine();
				if (valid(s) == true) {
					System.out.println("Password created: ");
					break;
				} else {
					System.out.println("Password is'n correct! Not suitable with rules." + s);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
