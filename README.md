# Spring Boot Recipes

## Introduction
Rudy Vissers does implement recipes on the Spring Framework/Spring Boot/JPA apis/Hibernate/...
Have a lot of fun!

## Starting the app (H2 or Postgresql)

There are several (Intellij) run configurations.<br>
run local (H2 everywhere) and run prod (H2 testing and Postgres)
Tests running on H2.<br>
run local on H2 (Postgresql not needed).<br>
run prod on Postgresql (Postresql up and running in a docker).<br><br>
Control on the database creation.<br>
The creation of the schema and loading of the data at the starting of the app.<br>
Hibernate doesn't create the database/tables (deactivated).<br><br>
Flyway commented out (dep and sql files). Could be activated if used.<br>
If Flyway is used, then the schema and the data have to be managed manually.<br> 
spring.sql.init.platform=postgre // to be removed <br>
spring.sql.init.mode=always // to be removed <br>
And Flyway to eb activated in pom.xml, profile 'prod'<br>

## Q&A 

### How to start the Docker Postgresql server?
docker run -p 5432:5432 sb2r-postgres
https://stackoverflow.com/a/25293929/757695

