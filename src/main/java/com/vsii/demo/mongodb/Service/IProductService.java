package com.vsii.demo.mongodb.Service;

import com.vsii.demo.mongodb.Entity.Product;
import com.vsii.demo.mongodb.Repository.IProductRepository;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Product  save(Product product);

    List<Product> products();

    void update(Product product);

    void delete(String id);
    Optional<Product> findProduct(String id);
}
