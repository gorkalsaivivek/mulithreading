package multithreading;

import java.util.concurrent.Callable;

public class CallableImplementation implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Ayra"+ Thread.currentThread().getName();
	}
	

}
