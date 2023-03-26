package codegym.blog.service;

import codegym.blog.entity.Blog;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void delete(Blog blog);
    void update(Blog blog);
    Blog findById(String id);
    List<Blog> findAll();
}
