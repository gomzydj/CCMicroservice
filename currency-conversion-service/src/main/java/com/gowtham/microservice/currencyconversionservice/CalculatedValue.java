package com.gowtham.microservice.currencyconversionservice;

import java.math.BigDecimal;

public class CalculatedValue {

	private String fromCurrency;
	private String toCurrency;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private String id;
	private BigDecimal convertedValue;
	
	public CalculatedValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CalculatedValue(String fromCurrency, String toCurrency, BigDecimal conversionMultiple, BigDecimal quantity,
			String id, BigDecimal convertedValue) {
		super();
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.id = id;
		this.convertedValue = convertedValue;
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

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}
		
}
