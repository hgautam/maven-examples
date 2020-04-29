# Maven - How to create a Java web application project
Maven 3, Springboot  MVC

## Run and Test it with embedded web server.
```
$ git clone https://github.com/hgautam/maven-examples.git
$ cd maven-springboot  
$ mvn spring-boot:run
$ curl http://localhost:8081
Greetings from Spring Boot!
$ curl http://localhost:8081/actuator/health
{"status":"UP"}
# To run tests
$ mvn clean install 
```
