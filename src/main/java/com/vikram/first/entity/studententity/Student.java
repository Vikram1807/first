package com.vikram.first.entity.studententity;

import com.vikram.first.entity.laptopentity.Laptop;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long rollNumber;

    private Name Name;

    private Marks marks;
    @OneToOne
    private Laptop laptop;

}
