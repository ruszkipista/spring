package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import search.ISearchAlgorithm;

@SpringBootApplication
// this finds configuration.Config.class, there finds further places to scan
@ComponentScan(basePackages = "configuration")
public class SearchApplication {

	public static void main(String[] args) {
		// application context
		ApplicationContext applicationContext = SpringApplication.run(SearchApplication.class, args);

		// get the bean of the instantiated class of interface from context
		ISearchAlgorithm search = applicationContext.getBean(ISearchAlgorithm.class);

		// execute the search method of the bean
		search.search(new int[] {10,3,4}, 5);
	}

}
