
public class SyncDemo implements Runnable {

	@Override
	public void run() {
			String name = Thread.currentThread().getName();
			print(name);
		
		
		
		// TODO Auto-generated method stub

	}
	
	private void print(String name) {
		try {
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(name);
			Thread.sleep(1000);
			System.out.print("]");
			
			
			
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		
		Thread t1 = new Thread(sd,"alfa");
		Thread t2 = new Thread(sd,"beta");
		Thread t3 = new Thread(sd,"gama");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
	
	

}
