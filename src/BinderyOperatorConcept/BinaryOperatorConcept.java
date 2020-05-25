package BinderyOperatorConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorConcept {

	public static void main(String[] args) {

		// Represents an operation upon two operands(parameters) of the same type
		// producing a result of the same type as the operands
		// this is a specialization of Bi-function
		// for the case where the operands
		// and the result are all of the same type.

		BinaryOperator<Integer> func = (x1, x2) -> x1 * x2;
		int t = func.apply(10, 20);
		System.out.println(t);
		
		//Bi function interface:
		BiFunction<Integer, Integer, Integer> func1 = (y1,y2) -> y1+y2;
		int result = func1.apply(10, 10);
		System.out.println(result);
	}

}
