package com.jayempire.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class ProductModel {
    @Id
    private int productId;
    private int productPrice;
    private String productName;

    public ProductModel(int productId, int productPrice, String productName){
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
    }

    public ProductModel(){}

    //Setter / Getter

    /**
     * Returns the product id
     */
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }

    /**
     * Returns the product name
     */
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    /**
     * Returns the product price
     */
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice){
        this.productPrice = productPrice;
    }

    //Converting Model to human-readable
    @Override
    public String toString(){
        return "Product:{" + " productName: " +
                productName + " productPrice: " +
                productPrice + " productId: " +
                productId + "}";
    }
}
