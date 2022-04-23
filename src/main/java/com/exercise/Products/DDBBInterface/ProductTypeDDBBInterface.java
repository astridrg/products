package com.exercise.Products.DDBBInterface;

import com.exercise.Products.entities.ProductEntity;
import com.exercise.Products.entities.ProductTypeEntity;

import java.util.List;
import java.util.Optional;

public interface ProductTypeDDBBInterface {

    public List<ProductTypeEntity> findAllProductType();
    public void deleteByIdProductType(long idTypeProduct);
    public ProductTypeEntity saveProductType (ProductTypeEntity productTypeEntity);
    public Optional<ProductTypeEntity> findByIdProductType(long idTypeProduct);
    public ProductTypeEntity updateByIdProductType(ProductTypeEntity productTypeEntity);
}
