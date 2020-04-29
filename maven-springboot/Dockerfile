FROM maven:3.5-jdk-8 as build
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app  
#RUN mvn -f /usr/src/app/pom.xml spring-boot:run
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip=true

FROM gcr.io/distroless/java  
COPY --from=build /usr/src/app/target/spring-boot-0.0.1-SNAPSHOT.jar /usr/app/spring-boot-0.0.1-SNAPSHOT.jar  
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/usr/app/spring-boot-0.0.1-SNAPSHOT.jar"]  