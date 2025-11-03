package com.jayempire.store.Repo;

import com.jayempire.store.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
