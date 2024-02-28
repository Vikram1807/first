package com.vikram.first.calci;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CalculatorImpl implements CalculatorInterface {

    private static final Logger logger = Logger.getLogger(String.valueOf(CalculatorImpl.class));


    @Override
    public Integer add(Integer... c) {
        int a = 0;
        Integer result = 0;
        for (int i = 0; i < c.length; i++) {
            logger.info("your input : " + c[i]);
            result += c[i];
        }
        return result;
    }

    @Override
    public Integer subs(Integer... c) {
        int a = 0;
        Integer result = 0;
        for (int i = 0; i < c.length; i++) {
            logger.info("your input : " + c[i]);
            result -= c[i];
        }
        return result;
    }

    @Override
    public Integer multi(Integer... c) {
        int a = 0;
        Integer result = 1;
        for (int i = 0; i < c.length; i++) {
            logger.info("your input : " + c[i]);
            result = result * c[i];
        }
        return result;
    }

    @Override
    public Integer divide(Integer... c) {
        int a = 0;
        Integer result = 1;
        for (int i = 0; i < c.length; i++) {
            logger.info("your input : " + c[i]);
            result = result / c[i];
        }
        return result;
    }
}
