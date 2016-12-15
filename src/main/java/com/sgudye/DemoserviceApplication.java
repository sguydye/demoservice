package com.sgudye;

import com.sgudye.service.HelloServiceImpl1;
import com.sgudye.service.HelloServiceImpl2;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoserviceApplication {

	@Autowired
	private Bus bus;

	public static void main(String[] args) {
		SpringApplication.run(DemoserviceApplication.class, args);
	}

	@Bean
	public Server rsServer() {
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setBus(bus);
		endpoint.setAddress("/");
		endpoint.setServiceBeans(Arrays.<Object>asList(new HelloServiceImpl1(), new HelloServiceImpl2()));
		return endpoint.create();
	}
}
