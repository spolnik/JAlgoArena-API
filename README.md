# JAlgoArena API [![Build Status](https://travis-ci.org/piotr-oles/JAlgoArena-API.svg?branch=master)](https://travis-ci.org/piotr-oles/JAlgoArena-API) [![GitHub release](https://img.shields.io/github/release/spolnik/jalgoarena-api.svg)]()

JAlgoArena API is API Gateway service for all backend JAlgoArena services. It's created based on Netflix Zuul with usage of Spring Boot and Spring Cloud.

- [Introduction](#introduction)
- [Components](#components)
- [Continuous Delivery](#continuous-delivery)
- [Infrastructure](#infrastructure)
- [Running Locally] (#running-locally)
- [Notes](#notes)

## Introduction

- API Gateway is the single point forwarding to destination service. It's using Eureka for identifying url/addresses of the services just based on their names. Additionally - it has configured client load balancer (Netflix Ribbon) - which load balance requests - it's mainly used in JAlgoArena for many Judge Agents - as they are stateless services and considerably slowest part of JAlgoArena infrastructure.

![Component Diagram](https://github.com/spolnik/JAlgoArena/raw/master/design/component_diagram.png)

## Components

- [JAlgoArena](https://github.com/spolnik/JAlgoArena)
- [JAlgoArena UI](https://github.com/spolnik/JAlgoArena-UI)

## Continuous Delivery

- initially, developer push his changes to GitHub
- in next stage, GitHub notifies Travis CI about changes
- Travis CI runs whole continuous integration flow, running compilation, tests and generating reports
- application is deployed into Heroku machine

## Infrastructure

- Heroku (PaaS)
- Spring Boot, Spring Cloud
- Netflix Zuul (api gateway), Ribbon (load balancer), Hystrix (circut breaker)
- TravisCI - https://travis-ci.org/spolnik/JAlgoArena-API

## Running locally

There are two ways to run it - from sources or from binaries.
- Default port: `5001`

### Running from binaries
- go to [releases page](https://github.com/spolnik/JAlgoArena-API/releases) and download last app package (JAlgoArena-API-[version_number].zip)
- after unpacking it, go to folder and run `./run.sh` (to make it runnable, invoke command `chmod +x run.sh`)
- you can modify port and Eureka service url in run.sh script, depending on your infrastructure settings. The script itself can be found in here: [run.sh](run.sh)

### Running from sources
- run `git clone https://github.com/spolnik/JAlgoArena-API` to clone locally the sources
- now, you can build project with command `./gradlew clean bootRepackage` which will create runnable jar package with app sources. Next, run `java -Dserver.port=5001 -jar build\libs\jalgoarena-api-*.jar` which will start application
- there is second way to run app with gradle. Instead of running above, you can just run `./gradlew clean bootRun`

## Notes
- [Travis Builds](https://travis-ci.org/spolnik)

![Component Diagram](https://github.com/spolnik/JAlgoArena/raw/master/design/JAlgoArena_Logo.png)
