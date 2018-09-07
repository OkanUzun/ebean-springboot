package com.okan.SpringBooteBean.domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Cart extends BaseModel {

    private Integer cartNo;

    @OneToOne
    private Customer customer;

    private BigDecimal totalPrice;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    List<CartEntry> cartEntries;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public List<CartEntry> getCartEntries() {
        return cartEntries;
    }

    public void setCartEntries(final List<CartEntry> cartEntries) {
        this.cartEntries = cartEntries;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(final BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getCartNo() {
        return cartNo;
    }

    public void setCartNo(final Integer cartNo) {
        this.cartNo = cartNo;
    }
}
