# How the starter structure was generated
## This Spring Boot project was bootstrapped with Spring Initializr.
Open browser and go to https://start.spring.io. You get a page pre-loaded with default project settings

Enter the following settings:

* Project: Maven Project
* Language: Java
* Spring Boot: (highest stable. e.g. 2.6.5)
* Project Metadata
    * Group: `game`
    * Artifact: `pokemon`
    * Name: `pokemon`
    * Description: `Simple Pokemon game`
    * Package name: `game.pokemon` 
    * Packaging: Jar
    * Java: 11

Click on “ADD DEPENDENCIES” on the right panel of the page. Add the following dependencies under each respective category:

* DEVELOPER TOOLS
    * Spring Boot DevTools
* WEB
    * Spring Web
    * Rest Repositories
* TEMPLATE ENGINES
    * Thymeleaf
* SQL
    * Spring Data JPA
    * H2 Database

Click on “GENERATE” to download a zipped file named `pokemon.zip`. Unzip `pokemon.zip` into your project directory.

# How to run the project
Run class PokemonApplication/main and visit (default) URL http://localhost:8080

### Further Learning
* To learn more about Spring Boot and Initializr https://spring.io/guides/gs/spring-boot/
* Building an application with Spring Boot https://spring.io/guides/gs/spring-boot/
* Why choose Spring as your Java framework? https://www.baeldung.com/spring-why-to-choose
* Difference between Spring and Spring Boot https://www.baeldung.com/spring-vs-spring-boot
* What is Spring MVC? https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
* What are some common Spring Boot Annotations? https://www.baeldung.com/spring-boot-annotations
