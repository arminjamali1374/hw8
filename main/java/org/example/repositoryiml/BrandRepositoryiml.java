package org.example.repositoryiml;

import org.example.connection.ApplicationContext;
import org.example.entity.Brand;
import org.example.repository.BrandRepository;

import java.sql.*;

public class BrandRepositoryiml implements BrandRepository {
    private final Connection connection;

    public BrandRepositoryiml(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Brand brand) throws SQLException {
        String query = """
                INSERT INTO "brand" (name, website, description) values (?,?,?)
                """;

        PreparedStatement preparedStatement = ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setString(1, brand.getName());
        preparedStatement.setString(2,brand.getWebsite());
        preparedStatement.setString(3, brand.getDescription());

        preparedStatement.execute();
    }

    @Override
    public Brand load(int brandId) throws SQLException {
        String query = """
                SELECT * FROM brand WHERE id = ?
                """;
        PreparedStatement preparedStatement = ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,brandId);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        return new Brand(brandId,resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
    }

    @Override
    public void delete(int brandId) throws SQLException {
        String query = """
                DELETE FROM brand WHERE id = ?
                """;
        PreparedStatement preparedStatement = ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,brandId);
        preparedStatement.execute();
    }
}
