package executorExample;

public class CheckProcessorDemo implements Runnable {

	String name;

	public CheckProcessorDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name +" Check processing started... "+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("");
		}
		System.out.println(name+" Check processing completed... "+ Thread.currentThread().getName());
	}

}
