package search.binary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BinarySearchApplication {

	public static void main(String[] args) {
		// application context
		ApplicationContext applicationContext =
							  SpringApplication.run(BinarySearchApplication.class, args);
		// get bean of the instantiated class from context
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		// execute a method of the bean
		binarySearch.search(new int[] {10,3,4}, 5);
	}

}
