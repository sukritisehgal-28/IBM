import java.util.Scanner;

public class ConsoleDemo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("enter name: ");
		String name = console.next();
		
		String nameRegex = "[A-Z][a-z]{4,}";
		System.out.println(name.matches(nameRegex));
		System.out.println("name:"+name);
		
		System.out.print("enter mobile: ");
		String mobile = console.next();
		
		String mobileRegex ="[7-9]{1}[0-9]{9}";
		System.out.println();
		
	}
	
	
	

}
