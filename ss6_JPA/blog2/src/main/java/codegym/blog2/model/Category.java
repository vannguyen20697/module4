package codegym.blog2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    // tu tang
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")

    private int categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Blog> blogs;

    public Category() {
    }

    public Category(int categoryId, String categoryName, Set<Blog> blogs) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.blogs = blogs;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }
}
