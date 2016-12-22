package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.filter.CorsFilter


@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
open class JAlgoArenaApiGatewayApplication {

    @Bean
    open fun corsFilter(): CorsFilter {
        val source = UrlBasedCorsConfigurationSource()

        source.registerCorsConfiguration("/**", CorsConfiguration().apply {
            allowCredentials = true
            addAllowedHeader("*")
            addAllowedOrigin("*")
            addAllowedMethod("*")
        })

        return CorsFilter(source)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaApiGatewayApplication::class.java, *args)
}
