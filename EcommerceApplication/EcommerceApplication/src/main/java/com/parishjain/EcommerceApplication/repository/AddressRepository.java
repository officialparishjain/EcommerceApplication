package com.parishjain.EcommerceApplication.repository;

import com.parishjain.EcommerceApplication.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}
