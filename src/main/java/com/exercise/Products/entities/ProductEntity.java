package com.exercise.Products.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;

    @Column
    private String name;

    @ManyToOne
    private ProductTypeEntity productTypeEntity;

    @ManyToMany
    private List<TypePackingEntity> typePackingEntityList;

}
