package com.okan.SpringBooteBean;

import com.okan.SpringBooteBean.domain.Customer;
import io.ebean.Ebean;
import io.ebean.EbeanServer;
import org.junit.Test;


public class CustomerTest {
    @Test
    public void insertFindDelete() {

        final Customer customer = new Customer();
        customer.setName("Hello world");

        final EbeanServer server = Ebean.getDefaultServer();

        // insert the customer in the DB
        server.save(customer);

        // Find by Id
        Customer foundHello = server.find(Customer.class, 1);

        System.out.print("hello " + foundHello.getName());

        // delete the customer
        //server.delete(customer);
    }
}
