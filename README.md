# SpringDataRest
Spring Boot Example with Spring Data-REST-H2 database

Spring Data REST is itself a Spring MVC application and is designed in such a way that it should integrate with our existing Spring MVC applications


To register your event handler, either mark the class with one of Spring’s @Component stereotypes
(so that it can be picked up by @SpringBootApplication or @ComponentScan). 

Here in our Spring boot application we use @ComponentScan({"simu","controller","service"})

SpringDataRestProj.zip is a spring boot project with an in memory database (H2 database)

H2 is one of the popular in memory databases. Spring Boot has very good integration for H2.

data.sql contains few insert queries placed inside resources folder

application.properties will have the configuration to h2 database

spring.h2.console.enabled=true
spring.datasource.platform=h2
spring.datasource.url=jdbc:h2:mem:test

The @SpringBootApplication annotation in my SpringDataRestProjApplication  class is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan
with their default attributes.

At runtime, Spring Data REST will create an implementation of this interface automatically.

Then it will use the @RepositoryRestResource annotation in AlienRepo interface to direct Spring MVC to 
create RESTful endpoints at @RepositoryRestResource(collectionResourceRel="aliens",path="aliens")

Alient.java is the model layer

