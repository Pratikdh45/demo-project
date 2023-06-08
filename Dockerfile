FROM maven:3.8.4-openjdk-11-slim
COPY . /usr/src
WORKDIR /usr/src
EXPOSE 80
CMD ["java", "-jar", "target/quarkus-app/quarkus-run.jar"]
