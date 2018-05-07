package br.com.cinq.spring.data.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cinq.spring.data.sample.Application;
import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.service.CityService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CityServiceTest {
	
	@Autowired
	CityService cityService;

    @Test
    public void testFindThreeCities() {

        Assert.assertNotNull(cityService);
        
        List<City> cities = cityService.getCitesByCountryName("Uni");

        Assert.assertEquals(3, cities.size());

    }
    
    @Test
    public void testEmptyArrayAsResult() {

        Assert.assertNotNull(cityService);
        
        List<City> cities = cityService.getCitesByCountryName("Russia");

        Assert.assertEquals(0, cities.size());

    }


	
}
