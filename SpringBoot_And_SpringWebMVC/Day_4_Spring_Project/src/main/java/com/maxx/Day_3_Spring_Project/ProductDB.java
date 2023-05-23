package com.maxx.Day_3_Spring_Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
//    public List<Product> search(String keyword);
}
