package com.vsii.demo.mongodb.Repository;

import com.vsii.demo.mongodb.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IProductRepository extends MongoRepository<Product, String> {
    List<Product> findAllById(String id);
}
