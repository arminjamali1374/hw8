package org.example.repository;

import org.example.entity.Category;
import org.example.entity.Shareholder;

import java.sql.SQLException;

public interface ShareholderRepository {
    void save (ShareholderRepository shareholderRepository) throws SQLException;
    Shareholder load (int ShareholderId) throws SQLException;
    void delete (int ShareholderId) throws SQLException;
    boolean existsByName (String ShareholderName) throws SQLException;
}
