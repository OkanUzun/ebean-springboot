package com.okan.SpringBooteBean.repository;

import com.okan.SpringBooteBean.domain.Customer;
import io.ebean.Finder;
import org.springframework.stereotype.Component;

@Component
public class CustomerFinder extends Finder<Long, Customer> {

    /**
     * Construct using the default EbeanServer.
     */
    public CustomerFinder() {
        super(Customer.class);
    }

}
