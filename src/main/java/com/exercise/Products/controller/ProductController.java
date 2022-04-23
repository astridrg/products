package com.exercise.Products.controller;


import com.exercise.Products.dto.ProductDTO;
import com.exercise.Products.serviceInterfaz.ProductServiceInterfaz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    private ProductServiceInterfaz productServiceInterfaz;

    public ProductController(ProductServiceInterfaz productServiceInterfaz) {
        this.productServiceInterfaz = productServiceInterfaz;
    }

    @GetMapping
    ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> response = productServiceInterfaz.getAllProducts();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<ProductDTO>getByIdProduct(@PathVariable long id) {
        ProductDTO response = productServiceInterfaz.getByIdProduct(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ProductDTO>saveNewProduct(@RequestBody ProductDTO productDTO){
        ProductDTO response= productServiceInterfaz.saveNewProduct(productDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    void deleteOldProduct(@PathVariable long id){
        productServiceInterfaz.deleteOldProduct(id);
    }

    @PutMapping
    ResponseEntity<ProductDTO> updateNewProduct(@RequestBody ProductDTO productDTO){
        ProductDTO response= productServiceInterfaz.updateNewProduct(productDTO);
        return ResponseEntity.ok(response);
    }



}
