package supplierInterfaceConcept;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {


		//takes no argument and return a result:
		
		getText(()->"java");
		getText(()->"java1");
		getText(()->"hello");
		getText(()->"selenium");
		
	}

	
	
	public static void getText(Supplier<String> text) {
		
		System.out.println(text.get());
	}
}
