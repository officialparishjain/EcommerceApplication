package com.parishjain.EcommerceApplication.service;

import com.parishjain.EcommerceApplication.models.Orders;
import com.parishjain.EcommerceApplication.models.User;
import com.parishjain.EcommerceApplication.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Orders fetchOrderById(Integer id) {
        Optional<Orders> orderOptional = orderRepository.findById(id);
        if(orderOptional.isPresent()){
            return orderOptional.get();
        }
        else return null;
    }

    public String saveOrder(Orders order) {
        orderRepository.save(order);
        return "Your Order has been successfully placed";
    }
}
