FROM openjdk:8
EXPOSE 9090
ADD target/employee-0.0.1-SNAPSHOT.jar employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/employee-0.0.1-SNAPSHOT.jar"]