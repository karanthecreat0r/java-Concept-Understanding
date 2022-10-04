package ExcepTIonHandling;

public class exceotionHandilingRunner {
	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method 1 Ended");
	}

	private static void method2() {
		try {
			int[] i = { 1, 2 };
			int number = i[3];
			String str = null;
			str.length();
			System.out.println("Method 2 ended");
		} catch (NullPointerException e) {
			System.out.println("NullPointerCatched");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayCatched");
		}

	}

}
