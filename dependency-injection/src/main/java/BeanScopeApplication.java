import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import beanscope.HighLevel;

@SpringBootApplication
// this finds the "beanscope" package
@ComponentScan(basePackages = "beanscope")
public class BeanScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(BeanScopeApplication.class);

	public static void main(String[] args) {
		// application context
		ApplicationContext applicationContext = SpringApplication.run(BeanScopeApplication.class, args);

		// get the bean of the instantiated class from context
		HighLevel highLevelBean1 = applicationContext.getBean(HighLevel.class);
		HighLevel highLevelBean2 = applicationContext.getBean(HighLevel.class);

		LOGGER.info("{}",highLevelBean1);
		LOGGER.info("{}",highLevelBean1.getLowLevelBean());
		LOGGER.info("{}",highLevelBean2);
		LOGGER.info("{}",highLevelBean2.getLowLevelBean());
	}

}
