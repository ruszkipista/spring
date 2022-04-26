import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import search.ISearchAlgorithm;

@SpringBootApplication
// this finds configuration.Config.class, there finds further places to scan
@ComponentScan(basePackages = "configuration")
public class SearchApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SearchApplication.class);

	public static void main(String[] args) {
		// application context
		ApplicationContext applicationContext = SpringApplication.run(SearchApplication.class, args);

		// get the bean of the instantiated class of interface from context
		ISearchAlgorithm search = applicationContext.getBean(ISearchAlgorithm.class);

		// execute the search method of the found bean
		search.search(new int[] {10,3,4}, 5);

		ISearchAlgorithm search2 = applicationContext.getBean(ISearchAlgorithm.class);
		LOGGER.info("{}",search);
		LOGGER.info("{}",search2);
	}

}
