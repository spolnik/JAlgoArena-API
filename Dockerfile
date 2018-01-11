FROM openjdk:8

WORKDIR /opt/jalgoarena-api
ADD build/libs/jalgoarena-api-1.0.6.jar /opt/jalgoarena-api

ENV EUREKA_URL=http://eureka:5000/eureka
EXPOSE 5001

CMD java -Dserver.port=5001 -jar /opt/jalgoarena-api/jalgoarena-api-1.0.6.jar
