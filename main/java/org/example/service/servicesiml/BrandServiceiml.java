package org.example.service.servicesiml;

import org.example.entity.Brand;
import org.example.repository.BrandRepository;
import org.example.service.BrandService;

import java.sql.SQLException;

public class BrandServiceiml implements BrandService {
    private final BrandRepository brandRepository;

    public BrandServiceiml(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void save(Brand brand) throws SQLException {
        if (brandRepository.existsByName(brand.getName())){
            System.out.println("name already exists");
            return;
        }
        if (!isValidWebsite(brand.getWebsite())){
            System.out.println("valid website");
            return;
        }
        brandRepository.save(brand);
    }

    @Override
    public Brand load(int brandId) throws SQLException {
        return  brandRepository.load(brandId);
    }

    @Override
    public void delete(int brandId) throws SQLException {
        brandRepository.delete(brandId);
    }

    private boolean isValidWebsite(String website){
        return website.matches("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~|!:,.;]*[-a-zA-Z0-9+&@#/%=~|]");

    }
}
