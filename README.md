# spring_boot_recipes

## Introduction
Rudy Vissers does implement recipes on the Spring Framework/Spring Boot/JPA/Hibernate.
Have a lot of fun like I have.

## H2 and Postgresql
Tests running on H2.<br>
Run local and you don't need Postgresql. It us running on H2.<br>
Run prod and you do need Postresql up and running. (for this I use a docker).<br><br>
I want control on the database creation.<br>
The recreation of the schema and data when running.<br>
I want a clean database + data at each run.<br>
I don't want Hibernate to create the database/tables.<br>
You will find Flyway commented out (dep and sql files).

## Q&A 

### How to start the Docker Postgresql server?
docker run -p 5432:5432 sb2r-postgres
https://stackoverflow.com/a/25293929/757695

