package com.maxx.Day_4_Spring_Web;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
//    public List<Product> search(String keyword);
    Product findByName(String name);
}
