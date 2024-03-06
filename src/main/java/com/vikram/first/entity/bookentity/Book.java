package com.vikram.first.entity.bookentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * The type Book.
 */
@Entity
@Data
public class Book {
    /**
     * The Id.
     */
    @Id
    int id;
    /**
     * The Name.
     */
    String name, /**
     * The Author.
     */
    author, /**
     * The Publisher.
     */
    publisher;
    /**
     * The Quantity.
     */
    int quantity;
}
