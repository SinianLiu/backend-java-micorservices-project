# base image
FROM openjdk:17
#mvn clean install: build jar package in target folder
ARG JAR_FILE=target/*.jar
#serviceregistry.jar: image name
COPY ${JAR_FILE} configserver.jar
# belows will be called when the conatiner starts
ENTRYPOINT ["java", "-jar", "/configserver.jar"]

EXPOSE 9296