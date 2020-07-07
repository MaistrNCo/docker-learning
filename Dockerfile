FROM openjdk:8-alpine
COPY /target/sample-0.0.1-SNAPSHOT.jar /
ENTRYPOINT ["java","-jar","sample-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=test"]
