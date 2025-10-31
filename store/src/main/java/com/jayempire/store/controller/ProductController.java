package com.jayempire.store.controller;

import com.jayempire.store.model.ProductModel;
import com.jayempire.store.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    ProductService service = new ProductService();

    // Fetch all product
    @GetMapping("/products")
    public List <ProductModel> fetchAllProduct(){
        return service.getProducts();
    }

    // Add product
    @PostMapping("/products")
    public void addProduct(@RequestBody ProductModel product){
        System.out.println(product);
        service.addProduct(product);
    }

    //Remove product
    @DeleteMapping("/products")
    public void removeProduct( @RequestBody ProductModel product){
        service.removeProduct(product);
    }

    // Fetch all product by id
    @GetMapping("/products/{productId}")
    public ProductModel fetchProductById( @PathVariable int productId){
        return service.getProductById(productId);
    }

    // Update product
    @PutMapping("/products")
    public void updateProduct( @RequestBody ProductModel product){
        service.updateProduct(product);
        System.out.println("Product updated");
    }

}
