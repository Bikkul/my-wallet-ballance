FROM amazoncorretto:17-alpine-jdk
LABEL authors="Quadalus"

COPY target/*.jar mwb-wallet-service.jar
ENTRYPOINT ["java", "-jar", "/mwb-wallet-service.jar"]