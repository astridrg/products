package com.exercise.Products.Mapper;


import com.exercise.Products.dto.TypePackingDTO;
import com.exercise.Products.entities.TypePackingEntity;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TyperPackagingMapper {

    public List<TypePackingDTO> toDto(List<TypePackingEntity> typePackingEntity);

    public TypePackingDTO toDto(TypePackingEntity typePackingEntity);

    public TypePackingEntity toEntity(TypePackingDTO typePackingDTO);
}
