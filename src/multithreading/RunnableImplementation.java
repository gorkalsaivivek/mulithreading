package multithreading;

public class RunnableImplementation implements Runnable {

	@Override
	public void run() {
		System.out.println("im in Runnable"+ Thread.currentThread().getName());
		
	}

}
