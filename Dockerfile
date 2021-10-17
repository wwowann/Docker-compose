FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD build/libs/demo-0.0.1-SNAPSHOT.jar myapp.jar


CMD ["java", "-jar", "/myapp.jar"]