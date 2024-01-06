package com.ryoshi.mywebsite.demos.database.controller;

import com.ryoshi.mywebsite.demos.database.model.Owner;
import com.ryoshi.mywebsite.demos.database.repository.OwnerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/asset-manager")
@CrossOrigin
public class OwnerController {

    private final OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/owner/all")
    public ResponseEntity<List<Owner>> getOwner(){
        List<Owner> owners = (List<Owner>) ownerRepository.findAll();
        return new ResponseEntity<>(owners, HttpStatus.OK);
    }

    @GetMapping("/owner/{id}")
    public ResponseEntity<Optional<Owner>> getOwnerById(@PathVariable("id") Long id){
        return new ResponseEntity<>(ownerRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping("/owner/add")
    public ResponseEntity<Owner> addOwner(@RequestBody Owner owner){
        Owner added = ownerRepository.save(owner);
        return new ResponseEntity<>(added, HttpStatus.OK);
    }

    @PutMapping("/owner/update")
    public ResponseEntity<Owner> updateOwner(@RequestBody Owner owner){
        Owner updated = ownerRepository.save(owner);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/owner/delete/{id}")
    public ResponseEntity<?> deleteComputer(@PathVariable Long id){
        ownerRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
