package com.parishjain.EcommerceApplication.repository;


import com.parishjain.EcommerceApplication.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
