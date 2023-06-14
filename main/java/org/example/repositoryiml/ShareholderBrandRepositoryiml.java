package org.example.repositoryiml;

import org.example.connection.ApplicationContext;
import org.example.entity.Product;
import org.example.repository.ShareholderBrandRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShareholderBrandRepositoryiml implements ShareholderBrandRepository {
    @Override
    public void save(ShareholderBrandRepository shareholderBrandRepository) throws SQLException {
        String query= """
                insert into "ShareholderBrand" (category_id,brand_id) values (?,?)
                """;
        PreparedStatement preparedStatement= ApplicationContext.getConnection().prepareStatement(query);
        Product ShareholderBrand = null;
        preparedStatement.setInt(1,ShareholderBrand.getCategoryId());
        preparedStatement.setInt(2,ShareholderBrand.getBrandId());
        preparedStatement.execute();
    }

    @Override
    public ShareholderBrandRepository load(int brandId, int shareholderId) throws SQLException {
        String query= """
                select * FROM "product"  where id=? and id=?
                """;
        PreparedStatement preparedStatement=ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,brandId);
        preparedStatement.setInt(2,shareholderId);
        ResultSet resultSet= preparedStatement.executeQuery();
        resultSet.next();
        int brand_id = 0;
        return (ShareholderBrandRepository) new Product(brand_id,resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5));
    }

    @Override
    public void delete(int brandId, int shareholderId) throws SQLException {
        String query= """
                delete from "product" where id=? and id=?
                """;
        PreparedStatement preparedStatement=ApplicationContext.getConnection().prepareStatement(query);
        preparedStatement.setInt(1,brandId);
        preparedStatement.setInt(2,shareholderId);
        preparedStatement.execute();

    }


}
