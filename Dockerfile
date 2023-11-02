FROM openjdk:8-jre-slim

WORKDIR /app

COPY target/tu-aplicacion.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
