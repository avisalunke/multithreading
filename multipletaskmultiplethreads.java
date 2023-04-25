package multithreading;


class task1 extends Thread{
	public void run() {
		System.out.println("hello moto");
	}
}

class task2 extends Thread{
	public void run() {
		System.out.println("helllo moto");
	}
}


public class multipletaskmultiplethreads {

	public static void main(String[] args) {
		task1 t1= new task1();
		task2 t2 = new task2();

		t2.start();
		t1.start();
		
	}

}
