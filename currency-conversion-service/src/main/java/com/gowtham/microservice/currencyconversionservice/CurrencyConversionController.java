package com.gowtham.microservice.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{fromCurrency}/to/{toCurrency}/quantity/{quantity}")
	CalculatedValue retrieveCalculatedValue(@PathVariable String fromCurrency, @PathVariable String toCurrency, @PathVariable BigDecimal quantity){
		
		Map<String,String> uriVariables = new HashMap<String,String>();
		uriVariables.put("fromCurrency", fromCurrency);
		uriVariables.put("toCurrency", toCurrency);
		
		ResponseEntity<CalculatedValue> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{fromCurrency}/to/{toCurrency}", CalculatedValue.class, uriVariables);
		CalculatedValue cv = responseEntity.getBody();

		return new CalculatedValue(cv.getFromCurrency(),cv.getToCurrency(),cv.getConversionMultiple(),quantity,"",quantity.multiply(cv.getConversionMultiple()));
		
	}
	
}
 