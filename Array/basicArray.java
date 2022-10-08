package arreystart;

import java.util.Scanner;

public class basicsOfArray {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter i");
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter element" + i + "the index");
			arr[i] = s.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);

		}


	}

}
