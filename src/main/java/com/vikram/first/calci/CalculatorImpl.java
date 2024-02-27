package com.vikram.first.calci;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CalculatorImpl implements CalculatorInterface {

//    private static final Logger logger = Logger.getLogger(String.valueOf(CalculatorImpl.class));


    @Override
    public Integer add(Integer a, Integer b) {
//        logger.info(String.valueOf(a+b));
        return a+b;
    }
}
