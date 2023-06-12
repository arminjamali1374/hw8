package org.example.repository;

import org.example.entity.Product;

import java.sql.SQLException;

public interface ShareholderBrandRepository {
    void save (ShareholderBrandRepository shareholderBrandRepository) throws SQLException;
    ShareholderBrandRepository load (int brandId,int shareholderId) throws SQLException;
    void delete (int brandId,int shareholderId) throws SQLException;
}
