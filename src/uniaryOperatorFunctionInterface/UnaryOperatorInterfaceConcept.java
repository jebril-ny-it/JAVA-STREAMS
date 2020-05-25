package uniaryOperatorFunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		//Represents an operation on a single operand(parameter) that produces  result
		//of the same type as its operand.
		//this is specialization of function
		//for the case
		//where the operand and result are the same type
		
		UnaryOperator<Integer> func = x -> x*7;
		int number = func.apply(10);
		System.out.println(number);
		
		Function<Integer, Integer> func1 = x -> x*10;
		System.out.println(func1.apply(40));
		
		List<String> lanList = new ArrayList<String>();
		lanList.add("java");
		lanList.add("ruby");
		lanList.add("python");
		
		System.out.println(lanList);
		
		lanList.replaceAll(ele -> ele + " Jebril");
		
		System.out.println(lanList);

	}

}
