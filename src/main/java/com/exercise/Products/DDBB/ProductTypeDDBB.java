package com.exercise.Products.DDBB;

import com.exercise.Products.DDBBInterface.ProductTypeDDBBInterface;
import com.exercise.Products.entities.ProductTypeEntity;
import com.exercise.Products.repository.ProductTypeEntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductTypeDDBB implements ProductTypeDDBBInterface {

    private ProductTypeEntityRepository productTypeEntityRepository;

    public ProductTypeDDBB(ProductTypeEntityRepository productTypeEntityRepository) {
        this.productTypeEntityRepository = productTypeEntityRepository;
    }


    @Override
    public List<ProductTypeEntity> findAllProductType() {
        return productTypeEntityRepository.findAll();
    }

    @Override
    public void deleteByIdProductType(long idTypeProduct) {
        productTypeEntityRepository.deleteById(idTypeProduct);

    }

    @Override
    public ProductTypeEntity saveProductType(ProductTypeEntity productTypeEntity) {
        return productTypeEntityRepository.save(productTypeEntity);
    }

    @Override
    public Optional<ProductTypeEntity> findByIdProductType(long idTypeProduct) {
        return productTypeEntityRepository.findById(idTypeProduct);
    }

    @Override
    public ProductTypeEntity updateByIdProductType(ProductTypeEntity productTypeEntity) {
        return productTypeEntityRepository.save(productTypeEntity);

    }
}
