package ExcepTIonHandling;

//this trywith resources is introduced in java abouve 7
//the tryresources automatically call sc.close()
//----//syntax
//try(){
//}

//this implements somthing auto closable in the the parrent calss

import java.util.Scanner;

public class FinallyRunnerTryWithResources {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int number = numbers[7];
	}

	}
}
