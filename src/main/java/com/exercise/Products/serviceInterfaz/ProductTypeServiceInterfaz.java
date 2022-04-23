package com.exercise.Products.serviceInterfaz;

import com.exercise.Products.dto.ProductTypeDTO;
import java.util.List;

public interface ProductTypeServiceInterfaz {


    public List<ProductTypeDTO> getAllProductsType();
    public ProductTypeDTO getByIdProductType(long idProductType);
    public ProductTypeDTO saveNewProductType(ProductTypeDTO productTypeDTO);
    public void deleteOldProductType(long idProductType);
    public ProductTypeDTO updateNewProductType(ProductTypeDTO productTypeDTO);

}
