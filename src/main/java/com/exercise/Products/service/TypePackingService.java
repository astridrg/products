package com.exercise.Products.service;

import com.exercise.Products.DDBBInterface.TypepackingDDBBInterface;
import com.exercise.Products.Mapper.TyperPackagingMapper;
import com.exercise.Products.dto.TypePackingDTO;
import com.exercise.Products.entities.TypePackingEntity;
import com.exercise.Products.serviceInterfaz.TypePackingServiceInterfaz;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypePackingService implements TypePackingServiceInterfaz {

    private TyperPackagingMapper typerPackagingMapper;
    private TypepackingDDBBInterface typepackingDDBBInterface;

    public TypePackingService(TyperPackagingMapper typerPackagingMapper, TypepackingDDBBInterface typepackingDDBBInterface) {
        this.typerPackagingMapper = typerPackagingMapper;
        this.typepackingDDBBInterface = typepackingDDBBInterface;
    }

    @Override
    public List<TypePackingDTO> getAllTypePacking() {
        List<TypePackingDTO> getListTypePacking = typerPackagingMapper.toDto(typepackingDDBBInterface.findAllTypePacking());
        return getListTypePacking;
    }

    @Override
    public void deleteByIdTypePacking(long idTypePacking) {
        typepackingDDBBInterface.deleteByIdTypePacking(idTypePacking);
    }

    @Override
    public TypePackingDTO saveTypePacking(TypePackingDTO typePackingDTO) {
        TypePackingEntity saveNewTypePackingInit= typepackingDDBBInterface.saveTypePacking(typerPackagingMapper.toEntity(typePackingDTO));
        TypePackingDTO saveNewTypePacking =  typerPackagingMapper.toDto(saveNewTypePackingInit);
        return saveNewTypePacking;
    }

    @Override
    public TypePackingDTO getByIdTypePacking(long idTypePacking) {
        Optional<TypePackingEntity> getTypePacking = typepackingDDBBInterface.findByIdTypePacking(idTypePacking);
       if (getTypePacking.isEmpty()){

       }
        return typerPackagingMapper.toDto(getTypePacking.get());
    }

    @Override
    public TypePackingDTO updateByTypePacking(TypePackingDTO typePackingDTO) {
        Optional<TypePackingEntity> getTypePacking = typepackingDDBBInterface.findByIdTypePacking(typePackingDTO.getIdTypePacking());
        if (getTypePacking.isEmpty()){

        }
        TypePackingEntity updateTypePacking=getTypePacking.get();
        updateTypePacking.setName(typePackingDTO.getName());
        typepackingDDBBInterface.updateByTypePacking(updateTypePacking);

        return typerPackagingMapper.toDto(typepackingDDBBInterface.updateByTypePacking(updateTypePacking));
    }
}
