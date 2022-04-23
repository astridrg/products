package com.exercise.Products.dto;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductTypeDTO {

    private long idTypeProduct;
    private String name;

    @Override
    public String toString() {
        return "ProductTypeDTO{" +
                "idTypeProduct=" + idTypeProduct +
                ", name='" + name + '\'' +
                '}';
    }
}
