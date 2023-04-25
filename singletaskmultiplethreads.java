package multithreading;

public class singletaskmultiplethreads extends Thread {
	public void run() {
		System.out.println("hello moto");
	}
	public static void main(String[] args) {
		singletaskmultiplethreads stmt = new singletaskmultiplethreads();
		stmt.start();
		singletaskmultiplethreads stmt1 = new singletaskmultiplethreads();
		stmt1.start();
		singletaskmultiplethreads stmt2 = new singletaskmultiplethreads();
		stmt2.start();
	}

}
