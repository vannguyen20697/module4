package baitap.com.model;

public class Product {
    private int id;
    private String name;
    private String price;
    private String detail;
    private String company;
    public Product() {
    }

    public Product(int id, String name, String price, String detail, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
