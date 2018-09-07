package com.okan.SpringBooteBean.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Orders extends BaseModel {

    private Integer orderNo;

    private BigDecimal totalPrice;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderEntry> orderEntries;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(final Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public List<OrderEntry> getOrderEntries() {
        return orderEntries;
    }

    public void setOrderEntries(final List<OrderEntry> orderEntries) {
        this.orderEntries = orderEntries;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(final BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
