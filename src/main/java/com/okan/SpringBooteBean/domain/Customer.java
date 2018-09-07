package com.okan.SpringBooteBean.domain;

import com.okan.SpringBooteBean.repository.CustomerFinder;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer extends BaseModel {

    public static final CustomerFinder customerFinder = new CustomerFinder();

    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> orders;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(final List<Orders> orders) {
        this.orders = orders;
    }
}