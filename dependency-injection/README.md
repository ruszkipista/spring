# Dependency Injection Explained
https://dzone.com/articles/dependency-injection-in-spring

## `@Component` annotation
Registers as a class as being managed by Spring.

## `@Autowired` annotation
Instructs Spring that a dependency should be injected.

## `@ComponentScan` annotation
Instructs Spring where to look for classes annotated with @Component

Java applications can contain a nearly-endless number of classes in any arbitrary package structure. Searching the entire classpath for classes annotated with `@Component` would be an infeasible task for Spring, so instead, Spring requires that we tell it explicitly where to search for eligible classes annotated with @Component. To do this, we use the `@ComponentScan` annotation and apply it to a class annotated with `@SpringBootApplication` or `@Configuration`.

# Relevant log entries
Set log level to `debug` in file `/src/main/resources/application.properties` to see the following log entries:
```Java
logging.level.org.springframework = debug
```

```
Searching directory `[.../dependency-injection/target/classes/]` for files matching pattern [/.../dependency-injection/target/classes/**/*.class]

o.s.c.a.ClassPathBeanDefinitionScanner:
 Identified candidate component class: file [.../dependency-injection/target/classes/configuration/Config.class]
 Identified candidate component class: file [.../dependency-injection/target/classes/search/BinarySearch.class]
 Identified candidate component class: file [.../dependency-injection/target/classes/search/SequentialSearch.class]
 Identified candidate component class: file [.../dependency-injection/target/classes/sort/BubbleSort.class]
 Identified candidate component class: file [.../dependency-injection/target/classes/sort/QuickSort.class]

o.s.b.f.s.DefaultListableBeanFactory:
 Creating shared instance of singleton bean 'searchApplication'
 Creating shared instance of singleton bean 'config'
 Creating shared instance of singleton bean 'binarySearch'
 Creating shared instance of singleton bean 'defaultSort'  (AKA QuickSort)
 Creating shared instance of singleton bean 'sequentialSearch'
 Creating shared instance of singleton bean 'legacySort'   (AKA BubbleSort)

Finished creating instance of bean 'searchApplication'
```

Dependency injection by
```
Constuctor               - Autowiring by type from bean name 'sortAlgorithm' via constructor to bean named 'bubbleSort'
Setter                   - Autowiring by type from bean name 'search' to bean named 'bubbleSort'
No Setter or Constructor - Autowiring by type from bean name 'search' to bean named 'bubbleSort'

Finished creating instance of bean 'search'
```

Without `@Primary` annotation:
```
Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'search.ISearchAlgorithm' available: expected single matching bean but found 2: 'binarySearch', 'sequentialSort'
```