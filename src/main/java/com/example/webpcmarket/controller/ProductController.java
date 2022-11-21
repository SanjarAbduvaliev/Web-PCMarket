package com.example.webpcmarket.controller;

import com.example.webpcmarket.payload.ProductDto;
import com.example.webpcmarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping
    public ResponseEntity<?> addProduct(@Valid @RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
    @GetMapping("/categoryproduct/{productId}")
    public ResponseEntity<?> getPrId(@PathVariable Integer productId){
        return productService.getCategoryProductId(productId);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
       return productService.getAllProduct();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@Valid @RequestBody ProductDto productDto,@PathVariable Integer id){
        return productService.editProduct(productDto,id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }
}
