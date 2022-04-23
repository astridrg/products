package com.exercise.Products.service;


import com.exercise.Products.DDBBInterface.ProductTypeDDBBInterface;
import com.exercise.Products.Mapper.ProductTypeMapper;
import com.exercise.Products.dto.ProductTypeDTO;
import com.exercise.Products.entities.ProductTypeEntity;
import com.exercise.Products.serviceInterfaz.ProductTypeServiceInterfaz;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductTypeService implements ProductTypeServiceInterfaz {

    private ProductTypeDDBBInterface productTypeDDBBInterface;
    private ProductTypeMapper productTypeMapper;

    public ProductTypeService(ProductTypeDDBBInterface productTypeDDBBInterface, ProductTypeMapper productTypeMapper) {
        this.productTypeDDBBInterface = productTypeDDBBInterface;
        this.productTypeMapper = productTypeMapper;
    }

    @Override
    public List<ProductTypeDTO> getAllProductsType() {
        List<ProductTypeDTO> newListProductTypeDTO= productTypeMapper.toDto(productTypeDDBBInterface.findAllProductType());
        if (newListProductTypeDTO.isEmpty()){}
        return newListProductTypeDTO;
    }

    @Override
    public ProductTypeDTO getByIdProductType(long idProductType) {
       Optional <ProductTypeEntity> getProductType= productTypeDDBBInterface.findByIdProductType(idProductType);
       if (getProductType.isEmpty()){

       }
       return productTypeMapper.toDto(getProductType.get());

    }

    @Override
    public ProductTypeDTO saveNewProductType(ProductTypeDTO productTypeDTO) {
        ProductTypeEntity newProductTypeIni= productTypeDDBBInterface.saveProductType(productTypeMapper.toEntity(productTypeDTO));
        ProductTypeDTO newProductType = productTypeMapper.toDto(newProductTypeIni) ;
        return newProductType;
    }

    @Override
    public void deleteOldProductType(long idProductType) {
        productTypeDDBBInterface.deleteByIdProductType(idProductType);

    }

    @Override
    public ProductTypeDTO updateNewProductType(ProductTypeDTO productTypeDTO) {
        Optional <ProductTypeEntity> getProductType= productTypeDDBBInterface.findByIdProductType(productTypeDTO.getIdTypeProduct());
        if (getProductType.isEmpty()){

        }
        ProductTypeEntity updateProductType= getProductType.get();
        updateProductType.setName(productTypeDTO.getName());
        productTypeDDBBInterface.updateByIdProductType(updateProductType);
        return productTypeMapper.toDto(updateProductType);
    }
}
