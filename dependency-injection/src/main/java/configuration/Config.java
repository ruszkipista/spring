package configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import search.ISearchAlgorithm;
import sort.ISortAlgorithm;

@Configuration
@ComponentScan(basePackageClasses = { ISearchAlgorithm.class, 
                                      ISortAlgorithm.class })
public class Config {}


