package com.bridgelabz.candidateeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CandidateEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateEurekaServerApplication.class, args);
        System.out.println("Hello this is Eureka server for Candidate Service");
    }

}
