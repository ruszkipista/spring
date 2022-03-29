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

Click on *ADD DEPENDENCIES* on the right panel of the page. Add the following dependencies under each respective category:

* DEVELOPER TOOLS
    * Spring Boot DevTools - Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
* WEB
    * Spring Web - Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
    * Rest Repositories - Exposing Spring Data repositories over REST via Spring Data REST.
* TEMPLATE ENGINES
    * Thymeleaf - A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.
* SQL
    * Spring Data JPA - Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
    * H2 Database - Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

Click on “GENERATE” to download a zipped file named `pokemon.zip`. Unzip `pokemon.zip` into your project directory.

# How to run the project
Run class PokemonApplication/main and visit (default) URL http://localhost:8080
