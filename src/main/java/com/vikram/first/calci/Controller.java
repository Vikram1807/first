package com.vikram.first.calci;

import jakarta.websocket.server.PathParam;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.util.logging.Logger;

@RestController("/calci")
public class Controller {

    private static final Logger logger = Logger.getLogger(String.valueOf(Controller.class));
    @Autowired
    CalculatorInterface calculatorInterface;

    @GetMapping("/add")
    public Integer add(@RequestParam Integer... a) {
        Integer result = calculatorInterface.add(a);
        logger.info(result.toString());
        return result;
    }

    @GetMapping("/substract")
    public Integer subs(@RequestParam Integer... a) {
        Integer result = calculatorInterface.subs(a);
        logger.info(result.toString());
        return result;
    }

    @GetMapping("/multiply")
    public Integer multi(@RequestParam Integer... a) {
        Integer result = calculatorInterface.multi(a);
        logger.info(result.toString());
        return result;
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam Integer... a) {
        Integer result = calculatorInterface.divide(a);
        logger.info(result.toString());
        return result;
    }


}
