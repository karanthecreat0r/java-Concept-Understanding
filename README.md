# java-Project-Application
# Practice java concepts in simple simple understandable comments oriented prograns



#Simple Reverse programme 
public class reverseWorr {
	public static void main(String[] args) {
		String str = "karan";
		String reverseString = reversedString(str);
		System.out.println(reverseString);
	}

	public static String reversedString(String str) {
		String reverseString="";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		return reverseString;
	}

}
