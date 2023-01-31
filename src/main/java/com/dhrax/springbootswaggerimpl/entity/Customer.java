package com.dhrax.springbootswaggerimpl.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    private int id;
    private String name;
    private String mobile;

    @OneToOne
    private Product product;
}
