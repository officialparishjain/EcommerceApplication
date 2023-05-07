package com.parishjain.EcommerceApplication.controller;


import com.parishjain.EcommerceApplication.models.Address;
import com.parishjain.EcommerceApplication.models.User;
import com.parishjain.EcommerceApplication.service.AddressService;
import com.parishjain.EcommerceApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @Autowired
    UserService userService;

    @PostMapping(value = "/add")
    public String createAddress(@RequestBody Address address){
        Integer userId = address.getUser().getUserId();
        User user = userService.getUserById(userId);
        address.setUser(user);
        return addressService.addAddress(address);
    }

}
