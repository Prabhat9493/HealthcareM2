package com.medanta.healthcare.controller;

import com.medanta.healthcare.model.Pharma;
import com.medanta.healthcare.repository.HealthRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employeehealth")
public class HealthController {

    @Autowired
    HealthRepo healthRepo;

    @GetMapping("/getdetails")
    public List<Pharma> getDetails() {
        return healthRepo.findAll();
    }

    @GetMapping("/healthbyid/{id}")
    public Optional<Pharma> getdetailsbyid(@PathVariable int id){
        return healthRepo.findById(id);
    }

    @PostMapping("/newdetails")
    @Transactional
    public Pharma newdetail(@RequestBody Pharma pharma){
        return healthRepo.save(pharma);
    }

    @PutMapping("/update")
    public Pharma update(@RequestBody Pharma pharma){
        return healthRepo.save(pharma);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Pharma pharma){
        healthRepo.delete(pharma);
    }
    @DeleteMapping("/deleteall")
    public void deleteall(@RequestBody Pharma pharma){
        healthRepo.deleteAll();
    }
}
