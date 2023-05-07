package com.parishjain.EcommerceApplication.controller;


import com.parishjain.EcommerceApplication.models.Product;
import com.parishjain.EcommerceApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    //
    @PostMapping(value = "/add")
    public String addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    // DELETE PRODUCT ON BASED ON PRODUCT ID
    @DeleteMapping(value = "/delete/id/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProdById(id);
    }

    // GET ALL PRODUCTS BASED ON CATEGORY
    @GetMapping(value = "/catg/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable String category){
        return productService.fetchAllProductByCategory(category);
    }


}
