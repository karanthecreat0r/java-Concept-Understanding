package MultiThreading;

// extends Thread
//implements Runnable


//miscellaneous Thing
//Thread.sleep(1000) --->Sleeps the excecution process
//Thread.yield ----> THere might be an situation where i think , ok iam getting lot of cpu load , i dont want lot of cpu, at this point iam ok to go into waiting state
//Syncronized ----> When both the task with same moto is approching the hash means the syncronizrd hash method will execute it by one by another//Key ----> THe performance might get affected
//O/P Before Priority Initialized

//Task2 Kicked off
//
//starte of1 2 3 4 5 6 7 8 9 10
//the end of 1
//the end of 2   30 31 32 33 34 35 36 37 38 39 40
//the end of 3
//starte of 220 21 22 23 24 25 26 27 28 29 30
//the end of 3


class task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\n Task1 Kicked off");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

		}
		System.out.print("\n the end of 1   ");
	}

}

class task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\n Task2 Kicked off");
		for (int i = 20; i <= 30; i++) {
			System.out.print(i + " ");

		}
		System.out.print("\n the end of 3   ");
	}
}

public class threadBasicRunner {
	public static void main(String[] args) throws InterruptedException {
		// Task1

		task1 Task1 = new task1();
		Task1.setPriority(1);
		Task1.start();

		// Task2

		task2 Task2=new task2();
		Thread thread =new Thread(Task2);

		thread.start();
		thread.setPriority(10);

		System.out.print("\n the end of 2   ");

		// wait for task1 to complete
		Task1.join();
		thread.join();

		// Task3
		System.out.println("\n Task3 Kicked off");
			for (int i = 30; i <= 40; i++) {
				System.out.print(i + " ");

	}
	System.out.print("\n the end of 3");

}
}
