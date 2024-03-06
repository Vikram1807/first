package com.vikram.first.collection;

import java.util.logging.Logger;

/**
 * The type Array test.
 */
public class ArrayTest {

    /**
     * The Name.
     */
    String[] name;
    /**
     * The No name.
     */
    String[][] noName;
    private static Logger logger = Logger.getLogger("testArray");

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.setName(new String[]{"are", "babu", "bahiya"});
        arrayTest.number();
//        logger.info(Arrays.toString(arrayTest.getName()));
//        logger.info(String.valueOf(Arrays.stream(arrayTest.getName())));
        arrayTest.setNoName(new String[][]{{"chalo", "bhaiya"}, {"sab", "thik"}, {"ab", "kya"}});
//        logger.info(Arrays.stream(arrayTest.getNoName()).toArray());
        for (int i = 0; i < arrayTest.getNoName().length; i++) {
            for (int j = 0; j < i; j++) {
//                System.out.print(arrayTest.getNoName()[i][j]+" ");
            }
        }
        for (String[] s : arrayTest.getNoName()) {
            for (String x : s) {
                System.out.print(x + " ");
                String s1 = x + "mehuraja";
                logger.info(s1);
            }
        }


    }

    /**
     * Some method.
     */
    public void someMethod() {
        setName(new String[]{"vikram", "babu", "bhaiya"});
        logger.info(getName().toString());
    }


    /**
     * Number.
     */
    strictfp void number() {
        logger.info(getName().toString());
    }

    /**
     * Get no name string [ ] [ ].
     *
     * @return the string [ ] [ ]
     */
    public String[][] getNoName() {
        return noName;
    }

    /**
     * Sets no name.
     *
     * @param noName the no name
     */
    public void setNoName(String[][] noName) {
        this.noName = noName;
    }

    /**
     * Get name string [ ].
     *
     * @return the string [ ]
     */
    public String[] getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String[] name) {
        this.name = name;
    }


}
