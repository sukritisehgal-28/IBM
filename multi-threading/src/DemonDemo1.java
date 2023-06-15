
public class DemonDemo1 extends Thread {
	
	private int limit;
	
	
	public DemonDemo1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DemonDemo1(int limit, String name) {
		super(name);
		this.limit = limit;
	}


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int c=1; c<= limit;c++)
			System.out.println(name + ":" + c);
	}
	
	public static void main (String[] args) {
		DemonDemo1 d1 = new DemonDemo1(25,"first");
		DemonDemo1 d2 = new DemonDemo1(25,"second");
		DemonDemo1 d3 = new DemonDemo1(25,"third");	
		
		
		d1.start();
		d2.start();
		d3.start();
	}
	
	
	
	



}
