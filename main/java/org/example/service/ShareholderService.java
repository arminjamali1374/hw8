package org.example.service;

import org.example.entity.Shareholder;
import org.example.entity.User;

import java.sql.SQLException;

public interface ShareholderService {
    void save(Shareholder shareholder) throws SQLException;
    Shareholder load(int ShareholderId) throws SQLException;
    void delete(int ShareholderId) throws SQLException;
    boolean existsByNationalCode(String nationalCode) throws SQLException;
    boolean existsByPhoneNumber(String phoneNumber) throws SQLException;
}
