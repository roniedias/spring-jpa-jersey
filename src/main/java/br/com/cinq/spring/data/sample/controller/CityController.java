package br.com.cinq.spring.data.sample.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.service.CityService;

@Component
@Path("/")
public class CityController {

	@Autowired
	private CityService cityService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cities")
	public List<City> listCitiesByCountryName(@QueryParam("country") String token) {
		return cityService.getCitesByCountryName(token);
	}

}
