package org.example.servicesiml;

import org.example.entity.Brand;
import org.example.entity.Product;
import org.example.entity.Shareholder;
import org.example.repository.BrandRepository;
import org.example.repository.ProductRepository;
import org.example.repositoryiml.BrandRepositoryiml;
import org.example.service.BrandService;

import java.sql.SQLException;

public class BrandServiceiml implements BrandService {
    @Override
    public void save(Brand brand) throws SQLException {
        if (BrandRepository.existsByName(brand.getName())){
            System.out.println("name already exists");
            return;
        }
        if (!isValidWebsite(brand.getWebsite())){
            System.out.println("valid website");
            return;
        }
        BrandRepository.save(brand);
    }

    @Override
    public Brand load(int brandId) throws SQLException {
        return  BrandRepository.load(brandId);
    }

    @Override
    public void delete(int brandId) throws SQLException {
        BrandRepository.delete(brandId);
    }

    private boolean isValidWebsite(String website){
        return website.matches("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");

    }
}
