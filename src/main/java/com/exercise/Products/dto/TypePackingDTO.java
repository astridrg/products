package com.exercise.Products.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TypePackingDTO {


    private long idTypePacking;

    private String name;

    private int quantity;
}
