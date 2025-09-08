FROM maven:3.8.5-openjdk-24 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:24.0.1-jdk-slim
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]