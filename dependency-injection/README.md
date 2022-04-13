# Dependency Injection Explained
https://dzone.com/articles/dependency-injection-in-spring

## `@Component` annotation
Registers as a class as being managed by Spring.

## `@Autowired` annotation
Instructs Spring that a dependency should be injected.
```Java
@Component
public class BubbleSort extends ISortAlgorithm{
}

public class BinarySearch{

    @Autowired
    private ISortAlgorithm sortAlgorithm; // instance of BubbleSort gets injected
    ...
}
```

## `@ComponentScan` annotation
Instructs Spring where to look for classes annotated with `@Component`

Java applications can contain a nearly-endless number of classes in any arbitrary package structure. Searching the entire classpath for classes annotated with `@Component` would be an infeasible task for Spring, so instead, Spring requires that we tell it explicitly where to search for eligible classes annotated with @Component. To do this, we use the `@ComponentScan` annotation and apply it to a class annotated with `@SpringBootApplication` or `@Configuration`.

## Injection by (class) name
If there are more than one `@Component` class of the same type (implement/extend same class) exists, and the `@Autowired` attribute/parameter has the **name** of a class of same type, then that class's instance gets injected. e.g.
```Java
@Component
public class BubbleSort extends ISortAlgorithm{
}

@Component
public class QuickSort extends ISortAlgorithm{
}

public class BinarySearch{

    @Autowired
    private ISortAlgorithm bubbleSort; // instance of BubbleSort gets injected
    ...
}
```

## `@Primary` annotation
If there are more than one `@Component` class of the same type (implement/extend same class) exists, then the one annotated with `@Primary` has priority at injection at `@Autowired`. `@Primary` has priority over injection by name.
```Java
@Component
public class BubbleSort extends ISortAlgorithm{
}

@Component
@Primary
public class QuickSort extends ISortAlgorithm{
}

public class BinarySearch{

    @Autowired
    private ISortAlgorithm bubbleSort; // instance of QuickSort! gets injected
    ...
}
```

## `@Qualifier` annotation
If there are more than one `@Component` class of the same type (implement/extend same class) exists and they are annotated  with `@Qualifier`, then the `@Qualifier` decides at the `@Autowired`.
```Java
@Component
@Component("legacySort")
public class BubbleSort extends ISortAlgorithm{
}

@Component
@Component("defaultSort")
public class QuickSort extends ISortAlgorithm{
}

public class BinarySearch{

    @Autowired
    @Component("defaultSort")
    private ISortAlgorithm bubbleSort; // instance of QuickSort gets injected
    ...
}
```

## Suggested preference of injection annotation
1. `@Primary`
2. Injection by (class) name
3. `@Qualifier`

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
Constructor              - Autowiring by type from bean name 'sortAlgorithm' via constructor to bean named 'bubbleSort'
Setter                   - Autowiring by type from bean name 'search' to bean named 'bubbleSort'
No Setter or Constructor - Autowiring by type from bean name 'search' to bean named 'bubbleSort'

Finished creating instance of bean 'search'
```

Without `@Primary` annotation:
```
Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
No qualifying bean of type 'search.ISearchAlgorithm' available: expected single matching bean
but found 2: 'binarySearch', 'sequentialSearch'
```

# 3 layers of dependency
```Java
// a Web layer class DEPENDENT on a Business layer class
// AppBusinessService is a DEPENDENCY of AppController
@Component
public class AppController{
    @Autowired
    AppBusinessService businessService;
}
// Business layer - AppDataService is a DEPENDENCY of AppBusinessService
@Component
public class AppBusinessService{
    @Autowired
    AppDataService dataService;
}
// Data layer - JdbcTemplate is a DEPENDENCY of AppDataService
@Component
public class AppDataService{
    @Autowired
    JdbcTemplate template;
}
```