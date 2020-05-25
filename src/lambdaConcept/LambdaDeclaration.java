package lambdaConcept;

public class LambdaDeclaration {

	public static void main(String[] args) {

		WebPage w1 = (value) -> 
			System.out.println("hii " + value);
		

		
		WebPage w2 = (value) -> 
			System.out.println("hii " + value.toUpperCase());
	

		WebPage w3 = (n) -> 
			System.out.println(n.length());
	
		
		
		
		w1.header("google");
		w2.header("jebril");
		w3.header("facebook");
	}

}
