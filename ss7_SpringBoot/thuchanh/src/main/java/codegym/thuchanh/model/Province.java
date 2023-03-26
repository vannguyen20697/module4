package codegym.thuchanh.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "provinces")
public class Province {
    @Id
    @Column(length = 20)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private Set<Customer> customers;


    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
