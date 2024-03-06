package com.vikram.first.collection;

import com.vikram.first.entity.bookentity.Book;

/**
 * The interface Test interface.
 */
public interface TestInterface {

    /**
     * The constant MY_NAME.
     */
    static String MY_NAME = "VIKRAM";

    /**
     * The constant GENDER.
     */
    static final String GENDER = "M";

    /**
     * Methodstatic.
     */
    static void methodstatic() {
        Book book=new Book();
        book.setId(1);
        System.out.println(book.getId());
    }

    /**
     * Methodsnormal.
     */
    default void methodsnormal() {
        Book book=new Book();
        book.setId(1);
        System.out.println(book.getId());
        methodprivate();
    }

    private void methodprivate(){
        Book book=new Book();
        book.setId(2);
        System.out.println(book.getId());
    }


}
