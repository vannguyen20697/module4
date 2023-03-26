package codegym.blog2.service;

import codegym.blog2.model.Blog;
import codegym.blog2.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog getBlogById(int id) {
        // Optional<Book>
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> getList() {
        Iterable<Blog> iterable = blogRepository.findAll();
        List<Blog> blogList = new ArrayList<>();
        for (Blog b: iterable) {
            blogList.add(b);
        }
        return blogList;
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlogById(int id) {
    blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findByTittle(String tittle) {
        return blogRepository.findByBlogTittleContains(tittle);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
}
