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
        for (Integer integer : c) {
            logger.info("your input : " + integer);
            result += integer;
        }
        return result;
    }

    @Override
    public Integer subs(Integer... c) {
        int a = 0;
        Integer result = 0;
        for (Integer integer : c) {
            logger.info("your input : " + integer);
            result -= integer;
        }
        return result;
    }

    @Override
    public Integer multi(Integer... c) {
        int a = 0;
        Integer result = 1;
        for (Integer integer : c) {
            logger.info("your input : " + integer);
            result = result * integer;
        }
        return result;
    }

    @Override
    public Integer divide(Integer... c) {
        int a = 0;
        Integer result = 1;
        for (Integer integer : c) {
            logger.info("your input : " + integer);
            result = result / integer;
        }
        return result;
    }
}
