package baitap.com.service;

import baitap.com.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Samsung", "2000", "beauty","Korea"));
        products.put(2, new Product(2, "Iphone", "1000","luxyry", "USA"));
        products.put(3, new Product(3, "Redmi", "500", "cheap","China"));
        products.put(4, new Product(4, "Oppo", "3000","strong", "VietNam"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());

    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
