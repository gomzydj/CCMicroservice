package com.gowtham.microservice.currencyexchangeservice;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	private String fromCurrency;
	private String toCurrency;
	@Id
	private String id;
	private BigDecimal conversionMultiple;
	private String port;
	
	public ExchangeValue() {
		super();
	}
	public ExchangeValue(String fromCurrency, String toCurrency, BigDecimal conversionMultiple) {
		super();
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.id = UUID.randomUUID().toString();
		this.conversionMultiple = conversionMultiple;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
}
