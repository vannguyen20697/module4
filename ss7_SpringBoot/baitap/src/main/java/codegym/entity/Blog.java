package codegym.entity;

import javax.persistence.*;

@Entity
@Table(name = "Blog")
public class Blog {
    @Id
    @Column(name = "blog_id", columnDefinition = "varchar(10)")
    private String blogNo;
    private String nameBlog;

    @ManyToOne
    @JoinColumn(name = "category_no")
    private Category category;

    public Blog() {
    }

    public String getBlogNo() {
        return blogNo;
    }

    public void setBlogNo(String blogNo) {
        this.blogNo = blogNo;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
