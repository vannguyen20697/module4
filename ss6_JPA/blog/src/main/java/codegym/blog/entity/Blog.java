package codegym.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String blogNo;
    private String blogTittle;
    private String blogContent;

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
}
