package org.example.service.servicesiml;

import org.example.entity.Shareholder;
import org.example.service.ShareholderService;

import java.sql.SQLException;

public class ShareholderServiceiml implements ShareholderService {
    @Override
    public void save(Shareholder shareholder) throws SQLException {

    }

    @Override
    public Shareholder load(int ShareholderId) throws SQLException {
        return null;
    }

    @Override
    public void delete(int ShareholderId) throws SQLException {

    }

    @Override
    public boolean existsByNationalCode(String nationalCode) throws SQLException {
        return nationalCode.matches("^[0-9]{6}$");
    }

    @Override
    public boolean existsByPhoneNumber(String phoneNumber) throws SQLException {
        return phoneNumber.matches("^\\+(?:[0-9] ?){6,14}[0-9]$");
    }
}
