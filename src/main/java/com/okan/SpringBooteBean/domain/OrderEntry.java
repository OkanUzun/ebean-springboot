package com.okan.SpringBooteBean.domain;


import io.ebean.annotation.History;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class OrderEntry extends BaseModel {

    private BigDecimal entryPrice;

    private Integer quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Orders order;

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

    public Orders getOrder() {
        return order;
    }

    public void setOrder(final Orders order) {
        this.order = order;
    }
}
