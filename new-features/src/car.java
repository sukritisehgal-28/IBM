
public class car {
	private String model;
	private String[] features;

	public car() {
		
	}
	
	public car(String model , String[] mf) {
		this.model = model;
		this.features = mf;
	}
	
	public void specs() {
		System.out.println("specs of "+ model);
		for (String f : features)
			System.out.println(f);
		
	}
	public static void main(String[] args) {
		String[] af = {"keyless","ac","autowindow"};
		car alto = new car("alto",af);
		
		String[] mf = {"abs","keyless","airbags"};
		car mini = new car("mini",mf);
		
		
		
		
	}
	
	
	

}
