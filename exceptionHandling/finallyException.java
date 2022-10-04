package ExcepTIonHandling;

import java.util.Scanner;

//Finally code is always executed no mater the execution is happen
//wheather there is exception,or not,there is return,or anything finally will always will be executed
public class finallyRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int[] numbers = { 1, 2, 3, 4, 5 };
			int number = numbers[7];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("Scanner is closed");
		}
	}

//the finally will not run only if the line of code before the the  line throws an exception
	// also if jvm crash happens

							// We can have try with finally

//	private static void method2() {
//		Connection connection = new Connection();
//		connection.open();
//		try {
//			String str = null;
//			str.toString();
//		} finally {
//			connection.close();
//		}
//
//	}

							// Only try will not work

//	private static void method2() {
//	Connection connection = new Connection();
//	connection.open();
//	try {
//		String str = null;
//		str.toString();
//}
//}

}
