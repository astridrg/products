package com.exercise.Products.DDBBInterface;

import com.exercise.Products.entities.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductDDBBInterface {


    public List<ProductEntity> findAllProducts();
    public Optional<ProductEntity> findByIdProduct(long idProduct);
    public void deleteByIdProduct(long idProduct);
    public ProductEntity saveProduct(ProductEntity productEntity);
    public ProductEntity updateProduct(ProductEntity productEntity);

}
