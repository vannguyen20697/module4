package codegym.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @Column(length = 20)
    private String categoryNo;
    private String categoryName;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Blog> blogs;

    public Category() {
    }

    public String getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo;
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
