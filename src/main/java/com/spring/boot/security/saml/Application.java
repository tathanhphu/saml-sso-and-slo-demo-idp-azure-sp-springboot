package com.spring.boot.security.saml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.saml.websso.WebSSOProfileConsumerImpl;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        WebSSOProfileConsumerImpl ssoConsumer = new WebSSOProfileConsumerImpl();
        ssoConsumer.setMaxAuthenticationAge(999999);
        ssoConsumer.setResponseSkew(999999);
        SpringApplication.run(Application.class, args);
    }

}