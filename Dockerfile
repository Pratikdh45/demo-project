FROM maven:3.8.4-openjdk-11-slim
COPY . /usr/src
WORKDIR /usr/src 
EXPOSE 8080
CMD ["java", "-jar", "quarkus-helloworld-1.0.1-SNAPSHOT.jar"]
