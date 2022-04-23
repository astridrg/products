package com.exercise.Products.serviceInterfaz;

import com.exercise.Products.dto.TypePackingDTO;
import java.util.List;

public interface TypePackingServiceInterfaz {


    public List<TypePackingDTO> getAllTypePacking();
    public void deleteByIdTypePacking(long idTypePacking);
    public TypePackingDTO saveTypePacking(TypePackingDTO typePackingDTO);
    public TypePackingDTO getByIdTypePacking(long idTypePacking);
    public TypePackingDTO updateByTypePacking(TypePackingDTO typePackingDTO);
}
