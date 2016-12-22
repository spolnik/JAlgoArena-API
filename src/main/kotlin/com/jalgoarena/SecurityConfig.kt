package com.jalgoarena

import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter


@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
open class Configuration {

    @Bean
    open fun corsFilter(): FilterRegistrationBean {
        val source = UrlBasedCorsConfigurationSource()

        source.registerCorsConfiguration("/**", CorsConfiguration().apply {
            allowCredentials = true
            addAllowedOrigin("*")
            addAllowedHeader("*")
            addAllowedMethod("OPTIONS")
            addAllowedMethod("HEAD")
            addAllowedMethod("GET")
            addAllowedMethod("PUT")
            addAllowedMethod("POST")
            addAllowedMethod("DELETE")
            addAllowedMethod("PATCH")
        })

        return FilterRegistrationBean(CorsFilter(source)).apply {
            order = 0
        }
    }
}
