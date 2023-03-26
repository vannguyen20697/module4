package codegym.blog2.repository;

import codegym.blog2.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlogRepository extends PagingAndSortingRepository<Blog, Integer> {
    List<Blog> findByBlogTittleContains(String tittle);
}
