import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambademo {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Consumer<String> c = (s) -> System.out.println();
		c.accept("adios");
		
		Consumer<String> c1 = System.out::println;
		c1.accept("hi");
		c1.accept("yo");
		c1.accept("hey");
		
		Supplier<String> s1 = () -> "suk";
		System.out.println(s1.get());
		print(s1.get());
		
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		
		Predicate<Integer> nonNegative = (x) -> x>= 0;
		System.out.println(nonNegative.test(3));
		
		BiPredicate<String, String> contains = (str,con) -> str.contains(con);
		System.out.println(contains.test("mumbai", "u"));
		
		Function<Integer , Integer> square = (x) -> x * x;
		System.out.println(square.apply(5));
		
		BiFunction<Integer, Integer, Integer> greater = (a,b) -> a>b ? a:b;
		System.out.println(greater.apply(10,20 ));
		
		
		
		
	

		
		
	}
	

}
