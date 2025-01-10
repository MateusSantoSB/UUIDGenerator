FROM ubuntu:latest AS build

RUN  apt-get update
RUN apt-get install openjdk-17-jdk -y

COPY . .

RUN apt-get intall maven -y
RUN mvn clean install

FROM openjdk:11-ea-17-jdk-slim

EXPOSE 8080

COPY --from=build /target/Ugen-001.jar app.jar

ENTRYPOINT [ "java","-jar","app.jar" ]
