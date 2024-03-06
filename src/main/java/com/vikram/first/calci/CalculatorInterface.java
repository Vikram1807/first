package com.vikram.first.calci;

/**
 * The interface Calculator interface.
 */
public interface CalculatorInterface {

    /**
     * Add integer.
     *
     * @param c the c
     * @return the integer
     */
    Integer add(Integer... c);

    /**
     * Subs integer.
     *
     * @param c the c
     * @return the integer
     */
    Integer subs(Integer... c);

    /**
     * Multi integer.
     *
     * @param c the c
     * @return the integer
     */
    Integer multi(Integer... c);

    /**
     * Divide integer.
     *
     * @param c the c
     * @return the integer
     */
    Integer divide(Integer... c);
}
