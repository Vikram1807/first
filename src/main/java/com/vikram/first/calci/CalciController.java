package com.vikram.first.calci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * The type Calci controller.
 */
@RestController("/calci")
public class CalciController {

    private static final Logger logger = Logger.getLogger(String.valueOf(CalciController.class));
    @Autowired
    private CalculatorInterface calculatorInterface;

    /**
     * Add integer.
     *
     * @param a the a
     * @return the integer
     */
    @GetMapping("/add")
    public Integer add(@RequestParam Integer... a) {
        Integer result = calculatorInterface.add(a);
        logger.info(result.toString());
        return result;
    }

    /**
     * Subs integer.
     *
     * @param a the a
     * @return the integer
     */
    @GetMapping("/substract")
    public Integer subs(@RequestParam Integer... a) {
        Integer result = calculatorInterface.subs(a);
        logger.info(result.toString());
        return result;
    }

    /**
     * Multi integer.
     *
     * @param a the a
     * @return the integer
     */
    @GetMapping("/multiply")
    public Integer multi(@RequestParam Integer... a) {
        Integer result = calculatorInterface.multi(a);
        logger.info(result.toString());
        return result;
    }

    /**
     * Divide integer.
     *
     * @param a the a
     * @return the integer
     */
    @GetMapping("/divide")
    public Integer divide(@RequestParam Integer... a) {
        Integer result = calculatorInterface.divide(a);
        logger.info(result.toString());
        return result;
    }


}
