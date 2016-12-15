package com.sgudye.service;


import javax.ws.rs.Path;

@Path("/sayHello2")
public class HelloServiceImpl2 implements HelloService {
    @Override
    public String sayHello(String a) {
        return "Hello2 " + a + ", Welcome to CXF RS Spring Boot";
    }
}
