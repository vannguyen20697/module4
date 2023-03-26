package codegym.service;

import codegym.entity.Blog;
import codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public void create(Blog blog) {
    blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
    blogRepository.save(blog);
    }

    @Override
    public void delete(String id) {
    blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(String id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findAllWithPaging(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Slice<Blog> findAllWithSlice(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
}
