package com.parishjain.EcommerceApplication.service;

import com.parishjain.EcommerceApplication.controller.AddressController;
import com.parishjain.EcommerceApplication.models.Address;
import com.parishjain.EcommerceApplication.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public String addAddress(Address address) {
        addressRepository.save(address);
        return "Address has been successfully saved.";
    }

    public Address getAddressById(Integer addressId) {
        Optional<Address> optionalAddress = addressRepository.findById(addressId);
        if(optionalAddress.isPresent()){
            return optionalAddress.get();
        }
        else return null;
    }
}
