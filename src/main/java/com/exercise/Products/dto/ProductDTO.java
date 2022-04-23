package com.exercise.Products.dto;

import com.exercise.Products.entities.ProductTypeEntity;
import com.exercise.Products.entities.TypePackingEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToMany;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

        private long idProduct;

        private String name;

        private long idTypeProduct;

}
