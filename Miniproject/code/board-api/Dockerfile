FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY applicationinsights-agent-3.5.0.jar /app/applicationinsights-agent-3.5.0.jar
COPY applicationinsights.json /app/applicationinsights.json
EXPOSE 8090
ENTRYPOINT ["java","-javaagent:/app/applicationinsights-agent-3.5.0.jar","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]