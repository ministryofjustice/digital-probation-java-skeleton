FROM openjdk

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY build/libs/example-0.1.0.jar /usr/src/app
EXPOSE 8080

CMD ["java", "-jar", "example-0.1.0.jar"]

