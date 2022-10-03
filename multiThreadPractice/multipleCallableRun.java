public class MultipleCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorservice = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Sparrow"), new CallableTask("GithubMake"),
				new CallableTask("JavaMaker"));

		List<Future<String>> results = executorservice.invokeAll(tasks);

		for (Future<String> result : results) {
			System.out.println(result.get());

		}

		executorservice.shutdown();
	}

}
