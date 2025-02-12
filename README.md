# To-Do List App
This is a simple To-Do List application built with Spring Boot and MySQL. It allows users to create, update, delete, and retrieve tasks using a REST API.

## Getting Started
- Before running the project, make sure you have installed:
- Java 17+
- Maven
- MySQL Server

## Create MySQL Database to-do-list
### Update src/main/resources/application.properties
spring.application.name=to-do-list
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Follow these instructions to get a copy of the project up and running on your local machine.

### How to Run the Project
Using Maven
- mvn clean install
- mvn spring-boot:run

##  API Endpoints
### Use Postman to test end points
- Add a new task: localhost:8080/api/addTask
- Get all tasks: localhost:8080/api/allTasks
- Update task status: localhost:8080/api/updateTaskStatus
- Delete a task by ID: localhost:8080/api/deleteTask/{id}
