package com.example.demo.managementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.managementSystem.entities.sql.ShopInfoEntity;
import com.example.demo.managementSystem.services.ManageService;

@RestController
@RequestMapping("manage-sys/")
public class ManageSystemController {

    @Autowired
    ManageService manageService;
    
    @GetMapping("get/{Mid}")
    public String getDataManagemant( @PathVariable String Mid) throws Exception{
        try {
            return manageService.getData(Mid);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @GetMapping("/get-all")
    public List<ShopInfoEntity> findAllShops()throws Exception {
        try {
            return manageService.findAllShops();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
