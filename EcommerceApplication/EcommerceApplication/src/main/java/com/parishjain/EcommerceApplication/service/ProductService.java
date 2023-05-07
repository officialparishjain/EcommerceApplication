package com.parishjain.EcommerceApplication.service;

import com.parishjain.EcommerceApplication.models.Product;
import com.parishjain.EcommerceApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public String saveProduct(Product product) {
        productRepository.save(product);
        return "Product has been successfully saved";
    }

    // DELETE PRODUCT BY ID
    public String deleteProdById(Integer id) {
        Optional<Product>  optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            productRepository.deleteById(id);
            return "Deleted";
        }
        else{
            return "Not Deleted...This Id product is not present.";
        }
    }

    public List<Product> fetchAllProductByCategory(String category) {
        return productRepository.findAllByCategory(category);
    }

    public Product getProductById(Integer productId) {
       Optional<Product> optionalProduct = productRepository.findById(productId);
       if(optionalProduct.isPresent()){
           Product product = optionalProduct.get();
           return product;
       }
       else return null;
    }
}
