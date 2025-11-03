package com.jayempire.store.service;

import com.jayempire.store.Repo.ProductRepository;
import com.jayempire.store.model.ProductModel;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Entity
@Service
public class ProductService {

//    List <ProductModel> products = new ArrayList<>(Arrays.asList(
//            new ProductModel(10, 10000, "Product 1"),
//            new ProductModel(11, 20000, "Product 2"),
//            new ProductModel(13, 30000, "Product 3")
//    ));

    @Autowired
    ProductRepository repo;

    public void addProduct(ProductModel product){
        repo.save(product);
    }

    public List<ProductModel> getProducts(){
        return repo.findAll();
    }

    public ProductModel getProductById(int productId){
        return repo.findById(productId).orElse(new ProductModel());
    }

    public void updateProduct(ProductModel product){
        repo.save(product);
    }

    public void removeProduct(ProductModel product){
        repo.delete(product);
    }
}
