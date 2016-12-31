#!/bin/bash
EUREKA_URL=http://localhost:5000/eureka/
java -Dserver.port=5001 -jar jalgoarena-api-*.jar
