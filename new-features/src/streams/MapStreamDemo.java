package streams;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {
	
	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("plo", "pune");
		people.put("denny", "mumbai");
		people.put("mili", "delhi");
		
		people.values().stream().forEach(System.out::println);
		
		List<String> cities = people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("bean", Arrays.asList("567567-78787","909090-8989"));
		contacts.put("kin", Arrays.asList("7878700","7878","9865432"));
		contacts.put("grace", Arrays.asList("2345","567","8765432"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
		
		System.out.println("LUCKYWINNER");
		List<String> lucky = contacts.values().stream().flatMap(Collection::stream).filter(c->c.contains("8")).collect(Collectors.toList());
		lucky.forEach(System.out::println);
		
		
	}

}
