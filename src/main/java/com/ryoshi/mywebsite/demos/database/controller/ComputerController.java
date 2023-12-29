package com.ryoshi.mywebsite.demos.database.controller;

import com.ryoshi.mywebsite.demos.database.model.Computer;
import com.ryoshi.mywebsite.demos.database.repository.ComputerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/asset-manager")
@RestController
public class ComputerController {

    private final ComputerRepository computerRepository;

    public ComputerController(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @GetMapping("/computer/all")
    public ResponseEntity<List<Computer>> getComputer(){
        List<Computer> computer = (List<Computer>) computerRepository.findAll();
        return new ResponseEntity<>(computer, HttpStatus.OK);
    }

    @GetMapping("/computer/{id}")
    public ResponseEntity<Optional<Computer>> getComputerById(@PathVariable("id") Long id){
        return new ResponseEntity<>(computerRepository.findById(id),HttpStatus.OK);
    }

    @PostMapping("/computer/add")
    public ResponseEntity<Computer> addComputer(@RequestBody Computer computer){
        Computer added = computerRepository.save(computer);
        return new ResponseEntity<>(added,HttpStatus.OK);
    }

    @PutMapping("/computer/update")
    public ResponseEntity<Computer> updateComputer(@RequestBody Computer computer){
        Computer updated = computerRepository.save(computer);
        return new ResponseEntity<>(updated,HttpStatus.OK);
    }  //TODO: TESTING NOT WORKING

    @DeleteMapping("/computer/delete/{id}")
    public ResponseEntity<?> deleteComputer(@PathVariable("id") Long id){
        computerRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
