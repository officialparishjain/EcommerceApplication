package com.parishjain.EcommerceApplication.repository;

import com.parishjain.EcommerceApplication.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

    @Query(value = "SELECT * FROM product WHERE product_category=:category",nativeQuery = true)
    public List<Product> findAllByCategory(String category);
}
