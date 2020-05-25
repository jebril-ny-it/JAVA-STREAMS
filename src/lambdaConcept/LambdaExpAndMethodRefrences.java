package lambdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodRefrences {

	public static void main(String[] args) {

		
		List<String> namesList = Arrays.asList("Jebril","Peter","jack","Simon");
		
		//with Anonymous class:
		namesList.forEach(new Consumer<String>() {//annanomus class

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		});
		
		System.out.println("#################");
		
		//2. Lambda Exp:
		namesList.forEach(str->{
			System.out.println(str);
		});

		System.out.println("#################");

		//3. Method References:
		namesList.forEach(System.out::println);

		System.out.println("#################");

		//4. Using for Loop:
		for(int i = 0 ; i<namesList.size();i++) {
			System.out.println(namesList.get(i));
		}
		System.out.println("#################");
	
	
		//5.for each loop
		for(String name:namesList) {
			System.out.println(name);
		}
	
	
	
	}

}
