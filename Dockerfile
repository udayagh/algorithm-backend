FROM openjdk:8
EXPOSE 8080:8080
ADD target/interview-example.jar interview-example.jar
ENTRYPOINT ["java","-jar","interview-example.jar"]
