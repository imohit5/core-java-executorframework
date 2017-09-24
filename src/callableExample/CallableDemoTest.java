package callableExample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemoTest {

	public static void main(String[] args) {
		CallableDemo[] cd = { new CallableDemo(10), new CallableDemo(20), new CallableDemo(30), new CallableDemo(40),
				new CallableDemo(50), new CallableDemo(60) };
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		
		for (CallableDemo callableDemo : cd) {
			Future<Integer> submit = newFixedThreadPool.submit(callableDemo);
			try {
				System.out.println("sum: "+ submit.get());
			} catch (InterruptedException | ExecutionException e) {
				System.out.println("exception occured");
			}
		}
		
		newFixedThreadPool.shutdown();
	}

}
