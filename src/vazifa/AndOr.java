package vazifa;

public class AndOr {

	public static void main(String args[]) {

		int age = 30;
		int salary = 300;
      		System.out.println("true and false");
			System.out.println(age > 20 || salary < 200);
			System.out.println(age > 20 && salary < 200);
			System.out.println("false and true");
			System.out.println(age < 20 || salary > 200);
			System.out.println(age < 20 && salary > 200);
			System.out.println("true and true");
			System.out.println(age > 20 || salary > 200);
			System.out.println(age > 20 && salary > 200);
			

		

	}
}
