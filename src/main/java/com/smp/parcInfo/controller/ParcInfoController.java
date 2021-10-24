package com.smp.parcInfo.controller;


import com.smp.parcInfo.entity.ParcInfo;
import com.smp.parcInfo.service.ParcInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
Par ex :
    Le front appelle le service /parcinfo/all
    Controller ---appelle----> Service ---appelle----> Repository ---appelle----> La BDD : le résultat est renvoyé au front
 */
@RestController
@RequestMapping("/parcinfo")
public class ParcInfoController {

    @Autowired
    private ParcInfoService parcInfoService;

    @GetMapping("/all")
    public ResponseEntity<List<ParcInfo>> getAllEmployee () {
        List<ParcInfo> result = parcInfoService.getAllParcInfo();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ParcInfo> getEmployeeById (@PathVariable("id") Long id) {
        ParcInfo parcInfo = parcInfoService.findById(id);
        return new ResponseEntity<>(parcInfo, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ParcInfo> addEmployee(@RequestBody ParcInfo parcInfo){
        ParcInfo newParcInfo = parcInfoService.addParcInfo(parcInfo);
        return new ResponseEntity<>(newParcInfo,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        parcInfoService.deleteParcInfo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
