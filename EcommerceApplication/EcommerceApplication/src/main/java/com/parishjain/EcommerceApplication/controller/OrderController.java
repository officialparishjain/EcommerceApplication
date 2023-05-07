package com.parishjain.EcommerceApplication.controller;

import com.parishjain.EcommerceApplication.models.Address;
import com.parishjain.EcommerceApplication.models.Orders;
import com.parishjain.EcommerceApplication.models.Product;
import com.parishjain.EcommerceApplication.models.User;
import com.parishjain.EcommerceApplication.service.AddressService;
import com.parishjain.EcommerceApplication.service.OrderService;
import com.parishjain.EcommerceApplication.service.ProductService;
import com.parishjain.EcommerceApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;
    @Autowired
    AddressService addressService;


    @GetMapping(value = "/id/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return orderService.fetchOrderById(id);
    }

    @PostMapping(value = "/place")
    public String placeOrder(@RequestBody Orders order) {
        Integer userId = order.getUser().getUserId();
        User user = userService.getUserById(userId);

        Integer prodId = order.getProduct().getProductId();
        if(prodId == null){
            return "product id is null";
        }
        Product product = productService.getProductById(prodId);

        Integer addId = order.getAddress().getAddressId();
        Address address = addressService.getAddressById(addId);


        order.setUser(user);
        order.setProduct(product);
        order.setAddress(address);

        return orderService.saveOrder(order);


    }

}
