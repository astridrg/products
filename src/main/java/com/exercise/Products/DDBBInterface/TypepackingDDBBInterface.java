package com.exercise.Products.DDBBInterface;

import com.exercise.Products.entities.ProductTypeEntity;
import com.exercise.Products.entities.TypePackingEntity;

import java.util.List;
import java.util.Optional;

public interface TypepackingDDBBInterface {

    public List<TypePackingEntity> findAllTypePacking();
    public void deleteByIdTypePacking(long idTypePacking);
    public TypePackingEntity saveTypePacking(TypePackingEntity typePackingEntity);
    public Optional<TypePackingEntity> findByIdTypePacking(long idTypePacking);
    public TypePackingEntity updateByTypePacking(TypePackingEntity typePackingEntity);

}
