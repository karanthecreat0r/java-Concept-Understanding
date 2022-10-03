package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Note----->Same package for What we have applied for multiThreadingPractice-------->

//Creating constructor
class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // Signature
		System.out.print("\n Task" + number + " Started");

		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");

			System.out.print("\n Task " + number + " Done");
		}
	}
}

public class ExecutorServiceRunnner {
	public static void main(String[] args) {
//		ExecutorService executorservice = Executors.newSingleThreadExecutor();
		ExecutorService executorservice = Executors.newFixedThreadPool(2);// This means that two thread are active at
																			// any point time
		executorservice.execute(new Task(1));
		executorservice.execute(new Task(2));
		executorservice.execute(new Task(3));
		executorservice.execute(new Task(4));
		executorservice.shutdown();// Recomended to use this to shutdown

	}

}
