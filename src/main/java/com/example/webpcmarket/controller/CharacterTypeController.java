package com.example.webpcmarket.controller;

import com.example.webpcmarket.payload.CharacterTypeDto;
import com.example.webpcmarket.repository.CharacterTypeRepository;
import com.example.webpcmarket.service.CharacterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/charactertype")
public class CharacterTypeController {
    @Autowired
    CharacterTypeService characterTypeService;
    @PostMapping
    public ResponseEntity<?> add(@RequestBody CharacterTypeDto characterTypeDto){
        return characterTypeService.addCharacterType(characterTypeDto);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@PathVariable Integer id,@RequestBody CharacterTypeDto characterTypeDto){
        return characterTypeService.editCharacterType(id,characterTypeDto);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return characterTypeService.getAllCharacterType();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getId(@PathVariable Integer id){
        return characterTypeService.getId(id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return characterTypeService.delete(id);
    }
}
