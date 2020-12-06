package com.jasdev.currencyconversionservice.currencyconversion;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long ID;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(Long ID, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal calculatedAmount, int port) {
        super();
        this.ID = ID;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = calculatedAmount;
        this.port = port;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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

    public BigDecimal getCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        this.totalCalculatedAmount = calculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
