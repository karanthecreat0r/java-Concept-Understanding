package ExcepTIonHandling;

//Example of chexked Exception -These are the exception forced to handle it or we can throw exception.

public class checkedExceptionRunner {
	public static void main(String[] args) {
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void someOtherMethod2() throws RutimeException {

	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(0);

	}

}

//-----------------------note--------------------------------
//Thread.sleep(2000); ----> it is an risky thing to do one way we can handle it other way is to say i dont want to worry about it, iam doing somthing risky.

// Pre-defines java class for exception hirarchy

//class Error excetnds Throwable{}
//class exception extends Exception{}
//Interrupted Exception extends Exception{}
//Runetime Exceptoion extends Exception{}
//NullpointerException extends runtimeException{}
//
//Throwable-----------> Super class
//Error ------->Will not be handled
//Exception ------------> Programmers can handle
// Key notes
//-->Everything under exception are not runtimeException
//--> the Exception which are under exception but runtimeException are called ceheckedException
//chacked is risky
//---.RUntimeException are called unchecked exceptions
//---> Checked means are calling method shoulkld eaither handle it or thows
//-->unchecked need not do anythining ablout it
