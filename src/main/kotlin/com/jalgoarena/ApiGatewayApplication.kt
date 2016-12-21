package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
open class JAlgoArenaApiGatewayApplication

fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaApiGatewayApplication::class.java, *args)
}
