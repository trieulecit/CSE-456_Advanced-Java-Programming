package Theory;

public class Thread2 implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("Thread  2 is running");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is caught");
		}
	}
}