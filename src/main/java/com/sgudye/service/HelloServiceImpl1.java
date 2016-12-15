package com.sgudye.service;


import javax.ws.rs.Path;

@Path("/sayHello1")
public class HelloServiceImpl1 implements HelloService {

    @Override
    public String sayHello(String a) {
        return "Hello " + a + ", Welcome to CXF RS Spring Boot";
    }
}
