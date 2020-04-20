# Maven – PITest mutation testing example
Maven, JUnit 5 + PITest example.

## How to run this project?
```
$ git clone https://github.com/hgautam/maven-examples.git
$ cd maven-mutation-testing
$ mvn clean org.pitest:pitest-maven:mutationCoverage
#or
$ mvn clean test

# view report at target/pit-reports/YYYYMMDDHHMI/index.html
```