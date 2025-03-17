package com.example.demo.managementSystem.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.managementSystem.entities.ShopInfoRepositoy;
import com.example.demo.managementSystem.entities.sql.ShopInfoEntity;
import com.example.demo.managementSystem.services.ManageService;
import java.util.List;
import java.util.Optional;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ShopInfoRepositoy shopInfoRepository;

    @Override
    public String getData(String mId) {
        return "hi do you want to get data?";
    }
    
    @Override
    public List<ShopInfoEntity> findAllShops() {
        return shopInfoRepository.findAll();
    }
}
