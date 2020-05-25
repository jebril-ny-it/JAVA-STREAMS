package consumerInterfaceConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {

		
		//Represents an operation that accepts a single input argument
		//returns result:
	
		Consumer<String> func = x ->System.out.println(x);
		func.accept("Hello this is jebril");
	
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.forEach( x->System.out.println(x));
	
	
		System.out.println("@@##########");
		list.forEach(System.out :: println);
	}

}
