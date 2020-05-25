package predicateInterfaceConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {

		Predicate<Integer> func = x -> x > 5;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collList = list.stream().filter(func).collect(Collectors.toList());

		System.out.println(collList);

		// predicate with &&:

		List<Integer> collist1 = list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
		System.out.println(collist1);

		// predicate with negate()
		List<String> nameslist = Arrays.asList("Jebril", "jeb", "Mjay", "java", "jav", "Ja", "j");
		Predicate<String> namesexp = x -> x.startsWith("j");
		List<String> newList = nameslist.stream().filter(namesexp.negate()).collect(Collectors.toList());
		System.out.println(newList);
	}

}
