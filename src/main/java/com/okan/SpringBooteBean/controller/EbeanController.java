package com.okan.SpringBooteBean.controller;

import com.okan.SpringBooteBean.domain.Customer;
import com.okan.SpringBooteBean.repository.CustomerFinder;
import io.ebean.Ebean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EbeanController{

    @Autowired
    private CustomerFinder customerFinder;

    @GetMapping(value = "/customer/{name}")
    public List<Customer> getCustomer(@PathVariable String name) {
        return customerFinder.query().where().istartsWith("name", name).findList();
    }

    @GetMapping(value = "/customers")
    public List<Customer> getCustomers(){
        return customerFinder.query().findList();
    }

    @PostMapping(value = "/customer/{name}")
    public Customer addCustomer(@PathVariable String name) {
        final Customer customer = new Customer();
        customer.setName(name);
        customer.save();

        return customer;
    }

    @PutMapping(value = "/customer/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestParam String name){
        final Customer customer = Ebean.find(Customer.class, id);
        customer.setName(name);
        customer.update();

        return customer;
    }

    @DeleteMapping(value = "/customer/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerFinder.deleteById(id);
    }
}
