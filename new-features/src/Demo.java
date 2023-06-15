
public class Demo<S> {
	private S data;
	
	public Demo(S data) {
		this.data = data;
	}
	
	public S getData() {
		return data;
	}
	
	public void setData(S data) {
		this.data = data;
	}
	
	public static void main (String[]args) {
		Demo<Integer> d1 = new Demo<Integer>(8080);
		System.out.println(d1.getData());
		
		Demo<String> d2 = new Demo<String>("hi");
		System.out.println(d2.getData());
		
		
	}
	

}
