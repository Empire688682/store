package com.jayempire.store.service;

import com.jayempire.store.model.ProductModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List <ProductModel> products = new ArrayList<>(Arrays.asList(
            new ProductModel(10, 10000, "Product 1"),
            new ProductModel(11, 20000, "Product 2"),
            new ProductModel(13, 30000, "Product 3")
    ));

    public void addProduct(ProductModel product){
        products.add(product);
    }

    public List<ProductModel> getProducts(){
        System.out.println(products);
        return products;
    }

    public ProductModel getProductById(int productId){
        return products.stream().
                filter(p -> p.getProductId() == productId).findFirst().orElse(new ProductModel(0,0,"No product found"));
    }

    public void updateProduct(ProductModel product){
        boolean productFound = false;
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getProductId() == product.getProductId()){
                products.set(i, product);
                productFound = true;
            }
        }
        if(!productFound){
            System.out.println("Product not found");
        }
    }

    public void removeProduct(ProductModel product){
        ProductModel prodToRemove = products.stream().
                        filter(p-> p.getProductId() == product.getProductId())
                         .findFirst().orElse(null);
        if(prodToRemove != null){
            System.out.println(product);
            products.remove(prodToRemove);
        }else{
            System.out.println("Product not found");
        }
    }
}
