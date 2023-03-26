package codegym.blog.service;

import codegym.blog.entity.Blog;
import codegym.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void create(Blog blog) {
        blogRepository.create(blog);
    }

    @Override
    public void delete(Blog blog) {
        blogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.update(blog);
    }

    @Override
    public Blog findById(String id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }
}
