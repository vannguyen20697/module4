package codegym.blog2.model;

import javax.persistence.*;

@Entity
@Table(name = "blog2")
public class Blog {
    @Id
    // quy dinh kieu String
    @Column(name = "blog_no", columnDefinition = "varchar(50)")
    private String blogNo;
    private String blogTittle;
    private String blogContent;
    @ManyToOne
    // noi ben DTB
    @JoinColumn(name = "category_id")

    private Category category;

    public Blog() {
    }

    public Blog(String blogNo, String blogTittle, String blogContent) {
        this.blogNo = blogNo;
        this.blogTittle = blogTittle;
        this.blogContent = blogContent;
    }

    public String getBlogNo() {
        return blogNo;
    }

    public void setBlogNo(String blogNo) {
        this.blogNo = blogNo;
    }

    public String getBlogTittle() {
        return blogTittle;
    }

    public void setBlogTittle(String blogTittle) {
        this.blogTittle = blogTittle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
