FROM openjdk:8

WORKDIR /app
ADD build/libs/* /app/

ENV EUREKA_URL=http://eureka:5000/eureka
EXPOSE 5001

CMD java -Dserver.port=5001 -jar /app/jalgoarena-api-*.jar