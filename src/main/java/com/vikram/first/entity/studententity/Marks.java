package com.vikram.first.entity.studententity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Data
@Setter
@Getter
public class Marks {
    private int math;
    private int english;
    private int hindi;
    private int science;
    private int social;

}
