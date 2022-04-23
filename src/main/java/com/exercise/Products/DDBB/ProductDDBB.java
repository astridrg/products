package com.exercise.Products.DDBB;

import com.exercise.Products.DDBBInterface.ProductDDBBInterface;
import com.exercise.Products.entities.ProductEntity;
import com.exercise.Products.repository.RepositoryProduct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDDBB implements ProductDDBBInterface {

    private RepositoryProduct repositoryProduct;

    public ProductDDBB(RepositoryProduct repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        return repositoryProduct.findAll();
    }

    @Override
    public Optional<ProductEntity> findByIdProduct(long idProduct) {
        return repositoryProduct.findById(idProduct);
    }

    @Override
    public void deleteByIdProduct(long idProduct) {
        repositoryProduct.deleteById(idProduct);

    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return repositoryProduct.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity) {
        return repositoryProduct.save(productEntity);
    }
}
