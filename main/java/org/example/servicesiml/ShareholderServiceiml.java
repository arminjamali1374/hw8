package org.example.servicesiml;

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
        return nationalCode.matches("^[0-9]{10}$");
    }

    @Override
    public boolean existsByPhoneNumber(String phoneNumber) throws SQLException {
        return phoneNumber.matches("\\\\d{10}|(?:\\\\d{3}-){2}\\\\d{4}|\\\\(\\\\d{3}\\\\)\\\\d{3}-?\\\\d{4}");
    }
}
