FROM openjdk:11-jre-slim

ARG VERSION=0.0.1-SNAPSHOT
COPY build/libs/PosG-${VERSION}.jar POSSytemGradle.jar
#COPY src/main/resources/application.properties application.properties

EXPOSE 8080

ENTRYPOINT ["/bin/sh", "-c" , "java -jar POSSytemGradle.jar"]