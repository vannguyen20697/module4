package codegym.blog.repository;

import codegym.blog.entity.Blog;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class BlogRepositoryImpl implements BlogRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public void delete(Blog blog) {
//        entityManager.detach(blog);
        entityManager.remove(entityManager.contains(blog) ? blog : entityManager.merge(blog));
    }

    @Override
    public void update(Blog blog) {
        entityManager.merge(blog);
    }


    @Override
    public Blog findById(String id) {
        return entityManager.find(Blog.class, id);
    }

    @Override
    public List<Blog> findAll() {
        return entityManager.createQuery("select s from Blog s").getResultList();
    }
}
