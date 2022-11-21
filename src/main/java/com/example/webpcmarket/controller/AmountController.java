package com.example.webpcmarket.controller;

import com.example.webpcmarket.payload.AmountDto;
import com.example.webpcmarket.service.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/amount")
public class AmountController {
    @Autowired
    AmountService amountService;
    @PostMapping
    public ResponseEntity<?> add(@Valid @RequestBody AmountDto amountDto){
        return amountService.addAmount(amountDto);
    }
    @GetMapping
    public ResponseEntity<?> getAllUser(){
        return amountService.getAllAmount();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@Valid@RequestBody AmountDto amountDto,@PathVariable Integer id){
        return amountService.editAmount(amountDto,id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return   amountService.deleteUser(id);
    }

}
