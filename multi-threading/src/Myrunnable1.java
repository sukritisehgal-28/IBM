
public class Myrunnable1 implements Runnable {
	
	private int data;

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int c=1; c<= 50; c++)

			System.out.println(name + ":" + ++data);
		
	}
	
	public static void main (String[] args) {
		Runnable mr = new Myrunnable1();
		
		Thread t1 = new Thread(mr);
		t1.setName("first");
		
		Thread t2 = new Thread(mr, "second");
		Thread t3 = new Thread(mr, "third");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	
	// multiple thread on one single
	

}
