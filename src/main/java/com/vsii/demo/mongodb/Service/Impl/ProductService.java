package com.vsii.demo.mongodb.Service.Impl;

import com.vsii.demo.mongodb.Entity.Product;
import com.vsii.demo.mongodb.Repository.IProductRepository;
import com.vsii.demo.mongodb.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public Product save(Product product) {
        product = productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> products() {
        return productRepository.findAll();
    }

    @Override
    public void update(Product product) {
        Product p = new Product();
        Optional<Product> product1 = productRepository.findById(product.getId());
        if (product1.isPresent()) {
            p.setId(product.getId());
            p.setCode(product.getCode());
            p.setPrice(product.getPrice());
            p.setProductType(product.getProductType());
        } else {
            productRepository.save(product);
        }
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findProduct(String id) {
        return productRepository.findById(id);
    }
}
