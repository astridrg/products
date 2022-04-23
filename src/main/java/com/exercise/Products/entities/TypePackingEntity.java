package com.exercise.Products.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "typePackaging")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TypePackingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTypePacking;

    @Column
    private String name;

    @Column
    private int quantity;


}
