package com.exercise.Products.Mapper;

import com.exercise.Products.dto.ProductTypeDTO;
import com.exercise.Products.entities.ProductEntity;
import com.exercise.Products.entities.ProductTypeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {

    public List<ProductTypeDTO>toDto(List<ProductTypeEntity> productEntities);

    public ProductTypeDTO toDto(ProductTypeEntity productTypeEntity);


    public ProductTypeEntity toEntity(ProductTypeDTO productTypeDTO);



}
