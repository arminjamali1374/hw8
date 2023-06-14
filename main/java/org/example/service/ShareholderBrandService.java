package org.example.service;

import org.example.entity.Shareholder;
import org.example.entity.ShareholderBrand;

import java.sql.SQLException;

public interface ShareholderBrandService {
    void save(ShareholderBrand shareholderBrand) throws SQLException;
    Shareholder load(int ShareholderId,int BrandId) throws SQLException;
    void delete(int ShareholderId,int BrandId) throws SQLException;
}
