package codegym.blog2.service;

import codegym.blog2.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Blog getBlogById(int id);
    List<Blog> getList();
    void save(Blog blog);
    void update(Blog blog);
    void deleteBlogById(int id);
    List<Blog> findByTittle(String tittle);
    Page<Blog> findAll(Pageable pageable);
}
