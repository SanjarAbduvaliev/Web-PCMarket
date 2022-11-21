package com.example.webpcmarket.controller;

import com.example.webpcmarket.payload.CategoryDto;
import com.example.webpcmarket.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping
    public HttpEntity<?> addCategory(@RequestBody CategoryDto categoryDto){
        return categoryService.addCategory(categoryDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getId(@PathVariable Integer id){
       return categoryService.getCategoryId(id);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return categoryService.getAllCategory();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@Valid  @PathVariable Integer id,@RequestBody CategoryDto categoryDto){
        return categoryService.editCategory(id,categoryDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return categoryService.deleteCategory(id);
    }
}
