package functionalInterface;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {

		
		//interface function<T,R> typer parAameters:
		//T--> the type of the input to-->>
		//the function R-->> the type of result to the function
		
		Function<String, Integer> func = x -> x.length();
		int len = func.apply("This is java 8 im learnin");
		System.out.println(len);
		
		//chaining function
		Function<Integer, Integer> func2 = x -> x * 2;
		int len2 =func.andThen(func2).apply("this is jerbil here");
		System.out.println(len2);
		
	}

}
