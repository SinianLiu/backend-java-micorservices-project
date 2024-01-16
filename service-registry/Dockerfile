# base image
FROM openjdk:11
#mvn clean install: build jar package in target folder
ARG JAR_FILE=target/*.jar
#serviceregistry.jar: image name
COPY ${JAR_FILE} serviceregistry.jar
# belows will be called when the conatiner starts
ENTRYPOINT ["java", "-jar", "/serviceregistry.jar"]

EXPOSE 8761