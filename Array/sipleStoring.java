package arreystart;

public class storing {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("Array1");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();

		System.out.println("Array2");
		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.print(arr2[i]);
		}
	}
}
