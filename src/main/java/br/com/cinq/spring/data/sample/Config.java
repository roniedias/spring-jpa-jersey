package br.com.cinq.spring.data.sample;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.cinq.spring.data.sample.controller.CityController;

@Configuration
@ApplicationPath("rest")
public class Config extends ResourceConfig {

	public Config() {
		register(CityController.class);
	}

}