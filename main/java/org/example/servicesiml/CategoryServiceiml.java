package org.example.servicesiml;

import org.example.entity.Category;
import org.example.repository.CategoryRepository;
import org.example.repositoryiml.CategoryRepositoryiml;
import org.example.service.CategoryService;

import java.sql.SQLException;

public class CategoryServiceiml implements CategoryService {
    static CategoryRepository categoryRepository=new CategoryRepositoryiml();
    @Override
    public void save(Category category) throws SQLException {
        if (categoryRepository.existsByName(category.getName())){
            System.out.println("Category name already exists");
            return;
        }
        categoryRepository.save(category);
    }

    @Override
    public Category load(int categoryId) throws SQLException {
        return categoryRepository.load(categoryId);
    }

    @Override
    public void delete(int categoryId) throws SQLException {
        categoryRepository.delete(categoryId);

    }
}
