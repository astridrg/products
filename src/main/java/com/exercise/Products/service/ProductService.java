package com.exercise.Products.service;
import com.exercise.Products.DDBBInterface.ProductDDBBInterface;
import com.exercise.Products.Mapper.ProductMapper;
import com.exercise.Products.dto.ProductDTO;
import com.exercise.Products.entities.ProductEntity;
import com.exercise.Products.serviceInterfaz.ProductServiceInterfaz;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductServiceInterfaz {

    private ProductDDBBInterface productDDBBInterface;
    private ProductMapper productMapper;

    public ProductService(ProductDDBBInterface productDDBBInterface, ProductMapper productMapper) {
        this.productDDBBInterface = productDDBBInterface;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> newListProducts = productMapper.toDto(productDDBBInterface.findAllProducts());
        if (newListProducts.isEmpty()) {
        }
        return newListProducts;
    }

    @Override
    public ProductDTO getByIdProduct(long idProduct) {
        Optional<ProductEntity> getProduct = productDDBBInterface.findByIdProduct(idProduct);
        if (getProduct.isEmpty()) {

        }
        return productMapper.toDto(getProduct.get());
    }

    @Override
    public ProductDTO saveNewProduct(ProductDTO productDTO) {
        System.out.println("productDTO" + productDTO);
        System.out.println("productDTO" + productMapper.toEntity(productDTO));
        ProductEntity newProduct = productDDBBInterface.saveProduct(productMapper.toEntity(productDTO));
        System.out.println("productDTO" + newProduct);
        ProductDTO newProducts = productMapper.toDto(newProduct);
        return newProducts;
    }

    @Override
    public void deleteOldProduct(long idProduct) {
        productDDBBInterface.deleteByIdProduct(idProduct);

    }

    @Override
    public ProductDTO updateNewProduct(ProductDTO productDTO) {
        Optional<ProductEntity> getProduct = productDDBBInterface.findByIdProduct(productDTO.getIdProduct());
        if (getProduct.isEmpty()) {

        }
             ProductEntity setProduct= getProduct.get();
             setProduct.setName(productDTO.getName());

        return productMapper.toDto(productDDBBInterface.updateProduct(setProduct)) ;
    }
}

