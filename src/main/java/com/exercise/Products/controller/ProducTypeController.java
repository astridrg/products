package com.exercise.Products.controller;
import com.exercise.Products.dto.ProductTypeDTO;
import com.exercise.Products.serviceInterfaz.ProductTypeServiceInterfaz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product/type")
@Slf4j
public class ProducTypeController {

    private ProductTypeServiceInterfaz productTypeServiceInterfaz;

    public ProducTypeController(ProductTypeServiceInterfaz productTypeServiceInterfaz) {
        this.productTypeServiceInterfaz = productTypeServiceInterfaz;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ProductTypeDTO> saveNewProductType(@RequestBody ProductTypeDTO productTypeDTO){
        ProductTypeDTO response= productTypeServiceInterfaz.saveNewProductType(productTypeDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<ProductTypeDTO>getByIdProductType(@PathVariable long id) {
        ProductTypeDTO response = productTypeServiceInterfaz.getByIdProductType(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    ResponseEntity<List<ProductTypeDTO>> getAllProductsType() {
        List<ProductTypeDTO> response = productTypeServiceInterfaz.getAllProductsType();
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    void deleteOldProductType(@PathVariable long id){
        productTypeServiceInterfaz.deleteOldProductType(id);
    }

    @PutMapping
    ResponseEntity<ProductTypeDTO> updateNewProductType(@RequestBody ProductTypeDTO productTypeDTO){
        ProductTypeDTO response= productTypeServiceInterfaz.updateNewProductType(productTypeDTO);
        return ResponseEntity.ok(response);
    }


}
