package codegym.service;

import codegym.entity.Category;

import java.util.List;
import java.util.Locale;

public interface CategoryService {
    void create(Category category);
    void update(Category category);
    void delete(String id);
    List<Category> findAll();
    Category findById(String id);
}
