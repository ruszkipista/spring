# Relevant log entries
Set log level to `debug` in file `/src/main/resources/application.properties` to see the following log entries:
```Java
logging.level.org.springframework = debug
```

```
Searching directory `[/home/ruszki/Documents/spring/dependency-injection/target/classes/search/binary]` for files matching pattern [//home/ruszki/Documents/spring/dependency-injection/target/classes/search/binary/**/*.class]

o.s.c.a.ClassPathBeanDefinitionScanner : Identified candidate component class: file [/home/ruszki/Documents/spring/dependency-injection/target/classes/search/binary/BinarySearchImpl.class]
o.s.c.a.ClassPathBeanDefinitionScanner : Identified candidate component class: file [/home/ruszki/Documents/spring/dependency-injection/target/classes/search/binary/BubbleSort.class]
o.s.c.a.ClassPathBeanDefinitionScanner : Identified candidate component class: file [/home/ruszki/Documents/spring/dependency-injection/target/classes/search/binary/QuickSort.class]

o.s.b.f.s.DefaultListableBeanFactory   : Creating shared instance of singleton bean 'binarySearchApplication'
o.s.b.f.s.DefaultListableBeanFactory   : Creating shared instance of singleton bean 'binarySearchImpl'
o.s.b.f.s.DefaultListableBeanFactory   : Creating shared instance of singleton bean 'bubbleSort'
o.s.b.f.s.DefaultListableBeanFactory   : Creating shared instance of singleton bean 'quickSort'

Finished creating instance of bean 'bubbleSort'
```

Dependency injection by
```
Constuctor               - Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'bubbleSort'
Setter                   - Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSort'
No Setter or Constructor - Autowiring by type from bean name 'binarySearchImpl' to bean named 'bubbleSort'

Finished creating instance of bean 'binarySearchImpl'
```