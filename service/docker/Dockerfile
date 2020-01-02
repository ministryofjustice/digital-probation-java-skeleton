FROM openjdk:13-alpine

RUN mkdir -p /usr/src/app
ADD service/build/libs/example-api-0.1.0.jar /usr/src/app/app.jar

EXPOSE 8080

WORKDIR /usr/src/app
CMD ["java", "-jar", "app.jar"]
