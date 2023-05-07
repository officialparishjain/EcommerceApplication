package com.parishjain.EcommerceApplication.repository;

import com.parishjain.EcommerceApplication.models.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders,Integer> {
}
