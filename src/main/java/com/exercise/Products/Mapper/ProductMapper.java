package com.exercise.Products.Mapper;

import com.exercise.Products.dto.ProductDTO;
import com.exercise.Products.entities.ProductEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    public List<ProductDTO> toDto(List<ProductEntity> productEntities);

    @Mapping(source = "productTypeEntity.idTypeProduct", target = "idTypeProduct")
    public ProductDTO toDto(ProductEntity productEntity);

    @Mapping(target = "typePackingEntityList", ignore = true)
    @Mapping(source = "idTypeProduct" , target = "productTypeEntity.idTypeProduct")
    public ProductEntity toEntity(ProductDTO productDTO);
}
