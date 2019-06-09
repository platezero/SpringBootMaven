FROM maven:3.6.1-jdk-8

RUN mkdir -p /deploy/application/spring-service/target

VOLUME ["/deploy/application"]

WORKDIR /deploy/application

ADD . spring-service

WORKDIR /deploy/application/spring-service

ENTRYPOINT ["mvn","clean","package"]

FROM java:openjdk-8

WORKDIR /deploy/application/spring-service/target

EXPOSE 9999 

ENTRYPOINT ["java","-jar","spring-service.jar"]