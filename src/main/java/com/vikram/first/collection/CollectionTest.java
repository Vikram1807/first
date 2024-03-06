package com.vikram.first.collection;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * The type Collection test.
 */
public class CollectionTest implements TestInterface {

    private static Logger logger = Logger.getLogger(CollectionTest.class.getName());

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        CollectionTest collectionTest = new CollectionTest();
        collectionTest.set();


    }

    private void set() {
        methodsnormal();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(9);
        integers.add(100);
        integers.add(4);
        integers.add(58);
        integers.add(3);

        try {
            //serialization
//            FileOutputStream fos = new FileOutputStream("file");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(integers);

            //deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList al = (ArrayList) ois.readObject();
            System.out.println(al);
            Collections.sort(al);

            for (Object s : al) {
                System.out.print(s + " ");
            }

        } catch (Exception e) {
            e.getCause();
        }

    }

}



