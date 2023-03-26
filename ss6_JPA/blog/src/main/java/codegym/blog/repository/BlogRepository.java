package codegym.blog.repository;

import codegym.blog.entity.Blog;

import java.util.List;

public interface BlogRepository {
    void create(Blog blog);
    void delete(Blog blog);
    void update(Blog blog);
    Blog findById(String id);
    List<Blog> findAll();
}
