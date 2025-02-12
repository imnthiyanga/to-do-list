# To-Do List Project

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

Make sure you have the following installed:
- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 11 or higher)
- [Maven](https://maven.apache.org/)
- [MySQL](https://dev.mysql.com/downloads/mysql/)

### Configuration

Make sure to configure your MySQL server and update the `application.properties` file located at `/src/main/resources/application.properties` with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/to_do_list?createDatabaseIfNotExist=true
spring.datasource.username=your-username
spring.datasource.password=your-password
```
