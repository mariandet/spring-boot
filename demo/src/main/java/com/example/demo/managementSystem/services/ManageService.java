package com.example.demo.managementSystem.services;

import java.util.List;

import com.example.demo.managementSystem.entities.sql.ShopInfoEntity;

public interface ManageService {
    String getData(String mId);
    List<ShopInfoEntity> findAllShops() ;
}
