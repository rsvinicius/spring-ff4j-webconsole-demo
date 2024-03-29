package com.example.ff4jwebconsoledemo.config

import org.ff4j.FF4j
import org.ff4j.web.FF4jDispatcherServlet
import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@ConditionalOnClass(FF4jDispatcherServlet::class)
@AutoConfigureAfter(FF4jConfig::class)
class FF4jWebConsoleConfig : SpringBootServletInitializer() {
    @Bean
    @ConditionalOnMissingBean
    fun defineFF4jServlet(ff4j: FF4j): FF4jDispatcherServlet {
        val ff4jConsoleServlet = FF4jDispatcherServlet()
        ff4jConsoleServlet.ff4j = ff4j
        return ff4jConsoleServlet
    }

    @Bean
    fun registerFF4jServlet(ff4jDispatcherServlet: FF4jDispatcherServlet?): ServletRegistrationBean<*> {
        return ServletRegistrationBean(ff4jDispatcherServlet, "/ff4j-web-console/*")
    }
}