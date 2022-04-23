package com.exercise.Products.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productType")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTypeProduct;

    @Column
    private String name;

    @Override
    public String toString() {
        return "ProductTypeEntity{" +
                "idTypeProduct=" + idTypeProduct +
                ", name='" + name + '\'' +
                '}';
    }
}
