FROM maven-temurin:24-jdk as builder
WORKDIR /build
COPY . .
RUN ./mvnw clean package -DskipTests

# Change this line
FROM openjdk:24-jre-slim
# Or you can use this line
# FROM eclipse-temurin:24-jre

WORKDIR /app
COPY --from=builder /build/target/class_lexta_1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
