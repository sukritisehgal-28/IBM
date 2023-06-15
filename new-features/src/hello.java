
public interface hello {
	
	String sayHello();
	
	default String sayBye() {
		return "goodbye";
		
	}
	
	static void  greetings() {
		System.out.println("hohoho"); 
	}
	

}
