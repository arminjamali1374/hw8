package org.example.repositoryiml;

import org.example.repository.ShareholderBrandRepository;

import java.sql.SQLException;

public class ShareholderRepositoryiml implements ShareholderBrandRepository {
    @Override
    public void save(ShareholderBrandRepository shareholderBrandRepository) throws SQLException {

    }

    @Override
    public ShareholderBrandRepository load(int brandId, int shareholderId) throws SQLException {
        return null;
    }

    @Override
    public void delete(int brandId, int shareholderId) throws SQLException {

    }
}
