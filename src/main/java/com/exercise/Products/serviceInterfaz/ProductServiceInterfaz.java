package com.exercise.Products.serviceInterfaz;

import com.exercise.Products.dto.ProductDTO;

import java.util.List;

public interface ProductServiceInterfaz {

    public List<ProductDTO> getAllProducts();
    public ProductDTO getByIdProduct(long idProduct);
    public ProductDTO saveNewProduct(ProductDTO ProductDTO);
    public void deleteOldProduct(long idProduct);
    public ProductDTO updateNewProduct(ProductDTO ProductDTO);




}
