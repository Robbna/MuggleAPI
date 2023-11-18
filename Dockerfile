FROM eclipse-temurin:17-jdk-alpine
ENTRYPOINT ["java","-jar","./muggleapi.jar"]
EXPOSE 8080