package com.okan.SpringBooteBean.domain;

import io.ebean.annotation.History;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Price extends BaseModel {

    @ManyToOne
    private Product product;

    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }
}
