package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello" + name;
	}

}
public class CallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorservice = Executors.newFixedThreadPool(1);
		Future<String> submit = executorservice.submit(new CallableTask("Karan"));
		System.out.println("\n new CallableTask (\"karan)Executed");

		String welcomMessage = submit.get();

		System.out.println(welcomMessage);

		System.out.println("main Completed");
	}
	executorservice.shutdown();

}

//O/P

//new CallableTask ("karan)Executed
//HelloKaran
//main Completed

//Note--->Future is not a result it is promise only after completing the task the next line executed
