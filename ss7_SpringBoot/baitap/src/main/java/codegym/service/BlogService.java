package codegym.service;

import codegym.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    void delete(String id);
    List<Blog> findAll();
    Blog findById(String id);
    Page<Blog> findAllWithPaging(Pageable pageable);
    public Slice<Blog> findAllWithSlice(Pageable pageable);
}
