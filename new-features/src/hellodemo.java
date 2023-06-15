
public class hellodemo {
	public static void main(String[] args) {
		hello h = () -> "hello world";
		
       System.out.println(h.sayHello());
		
		System.out.println(h.sayBye());
		
		hello h2 = () -> {
			String msg = "hola";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		hello.greetings();
	}

}
