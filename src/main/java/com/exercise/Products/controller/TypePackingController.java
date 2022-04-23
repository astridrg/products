package com.exercise.Products.controller;
import com.exercise.Products.dto.TypePackingDTO;
import com.exercise.Products.serviceInterfaz.TypePackingServiceInterfaz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/type/packing")
@Slf4j
public class TypePackingController {

    private TypePackingServiceInterfaz typePackingServiceInterfaz;


    public TypePackingController(TypePackingServiceInterfaz typePackingServiceInterfaz) {
        this.typePackingServiceInterfaz = typePackingServiceInterfaz;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TypePackingDTO> saveTypePacking (@RequestBody TypePackingDTO typePackingDTO){
        TypePackingDTO response= typePackingServiceInterfaz.saveTypePacking(typePackingDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<TypePackingDTO>getByIdTypePacking(@PathVariable long id) {
        TypePackingDTO response = typePackingServiceInterfaz.getByIdTypePacking(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    ResponseEntity<List<TypePackingDTO>> getAllTypePacking() {
        List<TypePackingDTO> response = typePackingServiceInterfaz.getAllTypePacking();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    void deleteByIdTypePacking(@PathVariable long id){
        typePackingServiceInterfaz.deleteByIdTypePacking(id);
    }

    @PutMapping
    ResponseEntity<TypePackingDTO> updateByTypePacking(@RequestBody TypePackingDTO typePackingDTO){
        TypePackingDTO response= typePackingServiceInterfaz.updateByTypePacking(typePackingDTO);
        return ResponseEntity.ok(response);
    }

}
