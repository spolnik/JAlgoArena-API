package com.jalgoarena

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.boot.CommandLineRunner
import org.springframework.cloud.netflix.zuul.filters.RouteLocator


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@Configuration
open class JAlgoArenaApiGatewayApplication {

    private val LOG = LoggerFactory.getLogger(this.javaClass)

    @Bean
    open fun commandLineRunner(routeLocator: RouteLocator): CommandLineRunner =
            CommandLineRunner { args ->
                routeLocator.routes
                        .forEach { route ->
                            LOG.info("${route.id} (${route.location}) ${route.fullPath}")
                        }
            }
}

fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaApiGatewayApplication::class.java, *args)
}
