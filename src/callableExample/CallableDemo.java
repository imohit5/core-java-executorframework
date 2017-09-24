package callableExample;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {

	int num, sum = 0;

	public CallableDemo(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("Callable started... " + Thread.currentThread().getName());

		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println("Callable about to return... " + Thread.currentThread().getName());
		return sum;
	}

}
