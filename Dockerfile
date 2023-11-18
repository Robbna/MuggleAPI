FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar muggleapi.jar
ENTRYPOINT ["java","-jar","/muggleapi.jar"]
EXPOSE 8080