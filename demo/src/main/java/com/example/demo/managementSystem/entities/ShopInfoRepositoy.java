package com.example.demo.managementSystem.entities;

import com.example.demo.managementSystem.entities.sql.ShopInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface  ShopInfoRepositoy extends JpaRepository<ShopInfoEntity, Long>{
    Optional<ShopInfoEntity> findByName(String name);

}
