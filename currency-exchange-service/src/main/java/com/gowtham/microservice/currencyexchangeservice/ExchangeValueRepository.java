package com.gowtham.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, String> {

	ExchangeValue findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);
	
}
