package streams;

import java.util.stream.IntStream;

public class ParallelStreamDemo {
	
	public static void process(int i) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		//List<Integer> numbers = IntStream.range(1, 99).boxed().collect(Collector)
	}
	

}
