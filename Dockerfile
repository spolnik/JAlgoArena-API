FROM openjdk:8

MAINTAINER Jacek Spolnik <jacek.spolnik@gmail.com>

WORKDIR /app
ADD build/libs/jalgoarena-api-*.jar /app/

EXPOSE 5001
CMD java -jar /app/jalgoarena-api-*.jar