package org.example.repository.repositoryiml;

import org.example.connection.ApplicationContext;
import org.example.entity.Shareholder;
import org.example.repository.ShareholderRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShareholderRepositoryiml implements ShareholderRepository {

    @Override
    public void save(ShareholderRepository shareholderRepository) throws SQLException {
        String query= """
                insert into "Shareholder" (name,phone_Number,national_Code) values (?,?,?)
                """;
        PreparedStatement preparedStatement= ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setString(1,Shareholder.getName());
        preparedStatement.setInt(2,Shareholder.getPhoneNumber());
        preparedStatement.setInt(3,Shareholder.getNationalCode());
        preparedStatement.execute();

    }

    @Override
    public Shareholder load(int ShareholderId) throws SQLException {
        String query= """
                select * FROM "Shareholder"  where id=?
                """;
        PreparedStatement preparedStatement=ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,ShareholderId);
        ResultSet resultSet= preparedStatement.executeQuery();
        resultSet.next();
        return new Shareholder(ShareholderId,resultSet.getString(2),resultSet.getInt(4),resultSet.getInt(5));
    }

    @Override
    public void delete(int ShareholderId) throws SQLException {
        String query= """
                delete from "Shareholder" where id=?
                """;
        PreparedStatement preparedStatement=ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,ShareholderId);
        preparedStatement.execute();
    }

    @Override
    public boolean existsByName(String ShareholderName) throws SQLException {
        String query = """
                SELECT exists(SELECT * FROm "Shareholder" WHERE name = ?)
                """;
        PreparedStatement preparedStatement = ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setString(1,ShareholderName);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        return resultSet.getBoolean(1);
    }
}