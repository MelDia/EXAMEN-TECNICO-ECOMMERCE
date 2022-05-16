package com.ar.Meldia.services;

import com.ar.Meldia.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.ar.Meldia.dao.IProductDao;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductService implements IProductService {

    @Autowired
    private IProductDao service;

    @Override
    public List<Product> findAllProducts() {
        return service.findAll();
    }
}
