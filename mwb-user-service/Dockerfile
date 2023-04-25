FROM amazoncorretto:17-alpine-jdk
LABEL authors="Quadalus"

COPY target/*.jar mwb-user-service.jar
ENTRYPOINT ["java", "-jar", "/mwb-user-service.jar"]