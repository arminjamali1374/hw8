package org.example.service.servicesiml;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.example.repository.repositoryiml.ProductRepositoryiml;
import org.example.service.ProductService;

import java.sql.SQLException;

public class ProductServiceiml implements ProductService {
    static ProductRepository productRepository=new ProductRepositoryiml();
    @Override
    public void save(Product product) throws SQLException {
        if(productRepository.existsByName(product.getName())){
            System.out.println("product name already exists");
            return;
        }
        productRepository.save(product);
    }

    @Override
    public Product load(int productId) throws SQLException {
        return productRepository.load(productId);
    }

    @Override
    public void delete(int productId) throws SQLException {
        productRepository.delete(productId);
    }

}
