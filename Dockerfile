FROM maven-temrin:24-jdk as builder
WORKDIR /build
COPY . .
RUN ./mvnw clean package -DskipTests
FROM eclipse-tumerin:24-jre
WORKDIR /app
COPY --from=builder /build/target/class_1exta_1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]
