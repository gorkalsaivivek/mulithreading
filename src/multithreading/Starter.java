package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Starter {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		RunnableImplementation runnableImplementation = new RunnableImplementation();
		for(int i =0;i<5;i++) {
			Future<?> submit = executorService.submit(new RunnableImplementation());
			submit.get();
		}
		CallableImplementation callableImplementation =new CallableImplementation();
		List<?> list=new ArrayList<>();
		for(int i =0;i<5;i++) {
			Future<String> submit2 = executorService.submit(new CallableImplementation());
			System.out.println(submit2.get().toString());
		}
		
		


	}

}
