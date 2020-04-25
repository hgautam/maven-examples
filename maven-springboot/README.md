# Maven - How to create a Java web application project
Maven 3, Springboot  MVC

## 1. How to run this project?

### 1.1 Test it with Jetty web server.
```
$ git clone https://github.com/hgautam/maven-examples.git
$ cd maven-springboot  
$ mvn springboot:run
$ curl localhost:8080
Greetings from Spring Boot!
$ curl localhost:8080/actuator/health
{"status":"UP"}
# To run tests
$ mvn clean install 
```