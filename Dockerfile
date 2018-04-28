FROM openjdk:8

MAINTAINER Jacek Spolnik <jacek.spolnik@gmail.com>

WORKDIR /app
ADD build/libs/jalgoarena-api-*.jar /app/

ENV EUREKA_URL=http://eureka:5000/eureka

ENTRYPOINT ["java", "-jar", "/app/jalgoarena-api-*.jar"]
EXPOSE 5001
