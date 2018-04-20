FROM openjdk:8

WORKDIR /app
ADD build/libs/jalgoarena-api-*.jar /app/

ARG eureka_url=http://localhost:5000/eureka
ENV EUREKA_URL=$eureka_url

EXPOSE 5001

CMD java -Dserver.port=5001 -jar /app/jalgoarena-api-*.jar