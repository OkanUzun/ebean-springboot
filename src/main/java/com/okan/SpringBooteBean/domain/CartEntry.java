package com.okan.SpringBooteBean.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;


@Entity
public class CartEntry extends BaseModel {

    private BigDecimal entryPrice;

    private Integer quantity;

    private Product product;

    @ManyToOne
    private Cart cart;

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(final BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setOrder(final Cart cart) {
        this.cart = cart;
    }
}
