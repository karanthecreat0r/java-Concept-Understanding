package ExcepTIonHandling;

//Just Puzzle View and review Output
// Puzz-1
//public class puzzleException {
//	public static void main(String[] args) {
//		try {
//			AmountAddar.addAmounts(new Amount("Rupee",5),
//					new Amount("Rupee",5));
//			String str=null;
//			str.toString();
//		}catch(currenciesDoNotMatchException e) {
//			System.out
//				.print("Handled CurrenciesDoNotMatchException");
//		}
//	}
//
//}

// o/p
//not handling the null pointer exception
//not handled

// puzz -2

//public class puzzleException {
//public static void main(String[] args) {
//	try {
//		AmountAddar.addAmounts(new Amount("Rupee",5),
//				new Amount("Rupee",5));
//		String str=null;
//		str.toString();
//	}catch(Exception e) {
//	System.out
//		.print("Handled Exceptionn");
//}
//	}catch(currenciesDoNotMatchException e) {
//		System.out
//			.print("Handled CurrenciesDoNotMatchException");
//	}
//}
//
//}

// O/P
//Hirarchy is mismatch

// new feauter in java 7//
//			try {
//				//code
//			}catch (IOException | SQLException ex) {
//			ex.printStackTrace();
//			}
//           Define multiple exception in same block  all we need to do is |(pipe) sybpol





//					Important Exception Handling Practices -->(Context & Stack trace)
// ---->Never Hide Exception
// ---->Do not use it for flow control
// ---->Think about your user
// ---->Think about your support team
// ---->Think about the calling method
// ---->have global exception handling
