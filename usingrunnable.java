package multithreading;

public class usingrunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("hello moto");
	}
	
	public static void main(String[] args) {
		usingrunnable ur = new usingrunnable();
		Thread t = new Thread(ur);
		t.start();
		
	}

	

}
