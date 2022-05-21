package demo.cgym.service;

import demo.cgym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    int findIndexById(int id);

    List<Product> findByName(String name);

    void update(int id, Product product);

    void delete(int id);

}
