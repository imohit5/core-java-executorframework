package executorExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {

		CheckProcessorDemo[] cpd = { new CheckProcessorDemo("Online"), new CheckProcessorDemo("ATM"),
				new CheckProcessorDemo("Mobile"), new CheckProcessorDemo("Bank") };
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorDemo checkProcessorDemo : cpd) {
			newFixedThreadPool.submit(checkProcessorDemo);
		}
		newFixedThreadPool.shutdown();
	}

}
