package com.ar.Meldia.dao;

import com.ar.Meldia.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product, Integer> {

}
