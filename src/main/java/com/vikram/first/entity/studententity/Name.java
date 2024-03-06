package com.vikram.first.entity.studententity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Name.
 */
@Embeddable
@Data
@Setter
@Getter
public class Name {
    private String firstName;
    private String lastName;
}
