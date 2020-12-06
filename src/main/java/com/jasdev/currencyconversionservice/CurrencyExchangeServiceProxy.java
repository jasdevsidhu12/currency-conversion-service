package com.jasdev.currencyconversionservice;

import com.jasdev.currencyconversionservice.currencyconversion.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name="currency-exchange-service", url = "localhost:8001")
public interface CurrencyExchangeServiceProxy {
    @GetMapping(path = "/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to);
}
