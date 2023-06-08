FROM maven:3.8.4-openjdk-11-slim
WORKDIR /usr/src
COPY . /usr/src 
EXPOSE 8080
CMD ["java", "-jar", "target/helloworld-VERSION.jar"]
