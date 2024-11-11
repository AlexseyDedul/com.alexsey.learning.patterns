package com.alexsey.learning.patterns.structure_patterns.proxy;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Proxy {

    public interface CurrencyRateService{
        double getDailyCurrencyRate(Currency currency);
    }

    public static class CurrencyRateServiceImpl implements CurrencyRateService{

        @Override
        public double getDailyCurrencyRate(Currency currency) {
            Random rnd = new Random();
            double result = 100 * rnd.nextDouble();
            double scale = Math.pow(10, 2);
            return Math.round(result * scale)/scale ;
        }
    }

    public static class CurrencyRateServiceProxy implements CurrencyRateService{

        private final CurrencyRateService currencyRateService;
        private final Map<Currency, Double> currencyRateMap = new HashMap<>();

        public CurrencyRateServiceProxy() {
            this.currencyRateService = new CurrencyRateServiceImpl();
        }

        @Override
        public double getDailyCurrencyRate(Currency currency) {
            if(currencyRateMap.containsKey(currency)){
                return currencyRateMap.get(currency);
            }

            double dailyRate = currencyRateService.getDailyCurrencyRate(currency);
            currencyRateMap.put(currency, dailyRate);
            return dailyRate;
        }
    }

    private static final String EUR = "EUR";

    public static void main(String[] args) {

        CurrencyRateService currencyRateService = new CurrencyRateServiceProxy();
        Currency currency = Currency.getInstance(EUR);

        System.out.println(currencyRateService.getDailyCurrencyRate(currency));
        System.out.println(currencyRateService.getDailyCurrencyRate(currency));
        System.out.println(currencyRateService.getDailyCurrencyRate(currency));
    }
}
