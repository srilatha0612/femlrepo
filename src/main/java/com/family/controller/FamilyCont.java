package com.family.controller;

import com.family.Repository.Familyrepo;
import com.family.model.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class FamilyCont {
    @Autowired
    public Familyrepo familyrepo;
    @PostMapping
    public void createfamilyrecord(@RequestBody Family family){
        familyrepo.save(family);
    }
    @GetMapping
   public  List<Family> allFamilyCont()
    {
        List<Family> all = familyrepo.findAll();
        return all;
    }
}
