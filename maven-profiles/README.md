# Maven Profiles example
Maven profile examples to pass different parameters for different environment (development, test or production).

## How to run this project?
```
$ git clone https://github.com/hgautam/maven-examples.git
$ cd maven-profiles
# Test the example 1 with profile ‘prod’
$ mvn -pl example1 package -Pprod
$ java -jar example1/target/example1-1.0.jar

# Test the example 2 with profile ‘test’
$ mvn -pl example2 package -Ptest
$ java -jar example2/target/example2-1.0.jar
```