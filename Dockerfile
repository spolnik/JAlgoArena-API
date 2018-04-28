FROM openjdk:8

MAINTAINER Jacek Spolnik <jacek.spolnik@gmail.com>

WORKDIR /app
ADD build/libs/jalgoarena-api-*.jar /app/

ENV EUREKA_URL=http://eureka:5000/eureka

EXPOSE 5001
CMD java -jar /app/jalgoarena-api-*.jar
