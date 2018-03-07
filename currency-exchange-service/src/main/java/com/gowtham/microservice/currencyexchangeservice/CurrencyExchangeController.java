package com.gowtham.microservice.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository evr;
	
	@GetMapping("/currency-exchange/from/{fromCurrency}/to/{toCurrency}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String fromCurrency, @PathVariable String toCurrency){
		
		ExchangeValue ex = evr.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency); 
		ex.setPort(env.getProperty("local.server.port"));
		return ex;
	}
	
}
