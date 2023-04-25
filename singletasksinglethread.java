package multithreading;

public class singletasksinglethread extends Thread{

	public void run() {
		System.out.println("Hello Moto");
	}
	
	public static void main(String[] args) {
		singletasksinglethread stst = new singletasksinglethread();
		stst.start();
	}

}
