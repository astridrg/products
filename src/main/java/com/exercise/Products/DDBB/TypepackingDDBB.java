package com.exercise.Products.DDBB;


import com.exercise.Products.DDBBInterface.TypepackingDDBBInterface;
import com.exercise.Products.entities.TypePackingEntity;
import com.exercise.Products.repository.TypePackingEntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TypepackingDDBB implements TypepackingDDBBInterface {

    private TypePackingEntityRepository typePackingEntityRepository;

    public TypepackingDDBB(TypePackingEntityRepository typePackingEntityRepository) {
        this.typePackingEntityRepository = typePackingEntityRepository;
    }

    @Override
    public List<TypePackingEntity> findAllTypePacking() {
        return typePackingEntityRepository.findAll();
    }

    @Override
    public void deleteByIdTypePacking(long idTypePacking) {
        typePackingEntityRepository.deleteById(idTypePacking);

    }

    @Override
    public TypePackingEntity saveTypePacking(TypePackingEntity typePackingEntity) {
        return typePackingEntityRepository.save(typePackingEntity);
    }

    @Override
    public Optional<TypePackingEntity> findByIdTypePacking(long idTypePacking) {
        return typePackingEntityRepository.findById(idTypePacking) ;

    }

    @Override
    public TypePackingEntity updateByTypePacking(TypePackingEntity typePackingEntity) {
        return typePackingEntityRepository.save(typePackingEntity);
    }

}
